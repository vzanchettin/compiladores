grammar Dubem;

/*---------------- COMPILER INTERNALS ----------------*/

@header
{
    import java.util.ArrayList;
}

@members
{
    private static ArrayList<String> symbol_table;
    private static ArrayList<Boolean> symbol_table_used;

    private static int stack_cur, stack_max;

    private static int count_while = 0;

    private static void emit(String bytecode, int delta) {
	System.out.println("   " + bytecode);
	stack_cur += delta;
	if (stack_max < stack_cur ) {stack_max  = stack_cur; }

    }

    public static void main(String[] args) throws Exception
    {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        DubemLexer lexer = new DubemLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DubemParser parser = new DubemParser(tokens);

        symbol_table = new ArrayList<String>();
        symbol_table_used = new ArrayList<Boolean>();
        symbol_table.add("args");
        symbol_table_used.add(true);
        parser.program();
        System.out.println("; symbols: " + symbol_table);
        System.out.println("; symbols: " + symbol_table_used);
        
        for(int i = 0; i < symbol_table_used.size(); i++)
		{
			if (symbol_table_used.get(i) == false) {
        		System.err.println("; WARNING : variables not used: " + symbol_table.get(i));
 	       	}
		} 
    }
}

/*---------------- LEXER RULES ----------------*/

PLUS   		: '+' ;
MINUS   	: '-' ;
TIMES   	: '*' ;
OVER    	: '/' ;
REMAINDER	: '%' ;
OPEN_P		: '(' ;
CLOSE_P		: ')' ;
ATTRIB      : '=' ;
COMMA 		: ',' ;
EQ			: '==' ;
NE			: '!=' ;
LT			: '<' ;
LE			: '<=' ;
GT			: '>' ;
GE			: '>=' ;

PRINT		: 'print';
READ_INT	: 'read_int'; 
WHILE 		: 'while' ;
END 		: 'end' ;
IF          : 'if' ;
ELSE        : 'else' ;
COMMENT     : '#' ~('\n')* { skip(); };

NUMBER     	: '0'..'9'+ ;
NAME        : 'a'..'z'+ ;
SPACE   	: (' '|'\t')+ { skip(); } ;
NL		    : ('\r')?'\n' ;

/*---------------- PARSER RULES ----------------*/

program
    :  
	{ 
		System.out.println(".source Test.j");
		System.out.println(".class public Test"); 
		System.out.println(".super  java/lang/Object"); 
		System.out.println(".method public <init>()V");  
		System.out.println("aload_0");
		System.out.println("invokenonvirtual java/lang/Object/<init>()V");
		System.out.println("return");
		System.out.println(".end method");
		System.out.println(".method public static main([Ljava/lang/String;)V");
		


	} 	
	
	( statement )*
	
	{ 
		System.out.println("  return"); 
		System.out.println(".limit stack"+ " " + stack_max); 
		System.out.println(".limit locals"+ " " + symbol_table.size()); 
		System.out.println(".end method");
	} 	
    ;

statement
  :	NL | st_print | st_attrib | st_while | st_if
;

st_print
  :	PRINT
	{
		emit("getstatic java/lang/System/out Ljava/io/PrintStream;", +1);
	}
	exp_aritmetic 
	{
		emit("invokevirtual java/io/PrintStream/print(I)V\n", -2);
	}
	(COMMA { emit("getstatic java/lang/System/out Ljava/io/PrintStream;", +1); } 
			exp_aritmetic 
		   { emit(" invokevirtual java/io/PrintStream/print(I)V\n", -2); }
	)* NL
	{
		emit("getstatic java/lang/System/out Ljava/io/PrintStream;", +1);
		emit(" invokevirtual java/io/PrintStream/println()V\n", -1);
	}
;
st_attrib
  : NAME ATTRIB exp_aritmetic NL
  	{
  		if(symbol_table.indexOf($NAME.text) == -1){
  			symbol_table.add($NAME.text);
  			symbol_table_used.add(false);
  		}

  		emit("istore "+symbol_table.indexOf($NAME.text), -1);
  	}
;
st_while
  : WHILE
  {
  	 int local = ++count_while;
  	 System.out.println("BEGIN_WHILE_"+local+":");
  }
  s = exp_comparison NL
  {
  	 emit($s.bytecode + " END_WHILE_"+local, -2);
  }
  (statement)*
  {
  	 emit("goto BEGIN_WHILE_"+local, 0);
  }
  END NL
  {
  	 System.out.println("END_WHILE_"+local+":");
  }
;
st_if
	: IF 
	s = exp_comparison	NL
		{ emit($s.bytecode + " NOT_IF", -2); }
	(statement)*
	{ 
		emit("goto END_ELSE", 0);
		System.out.println("NOT_IF:");
	}
	(ELSE NL (statement)* )?
		{ System.out.println("END_ELSE:"); }
	END NL
;
exp_comparison returns [String bytecode]
  : exp_aritmetic op = ( EQ | NE | LT | LE | GT | GE ) exp_aritmetic
  {
  	 if($op.type == EQ)      $bytecode = "if_icmpne";
   	 else if($op.type == NE) $bytecode = "if_icmpeq";
   	 else if($op.type == LT) $bytecode = "if_icmpge";
  	 else if($op.type == LE) $bytecode = "if_icmpgt";
  	 else if($op.type == GT) $bytecode = "if_icmple";
  	 else if($op.type == GE) $bytecode = "if_icmplt";
  }
;
exp_aritmetic
    :   term ( op = ( PLUS | MINUS ) term 
		{ emit($op.type == PLUS ? "iadd" : "isub", -1); }
	)*
	
;
term    
    :   factor ( op = ( TIMES  | OVER | REMAINDER) factor 
		{ emit($op.type == TIMES ? "imul" :
			($op.type == OVER ? "idiv": "irem"), -1); } 
	)*
	
;    
factor
    :   NUMBER
        	{ emit(" ldc " + $NUMBER.text, +1); }
    |	OPEN_P exp_aritmetic CLOSE_P
    |   NAME
    		{  if(symbol_table.indexOf($NAME.text) >= 0) {
    				emit(" iload "+symbol_table.indexOf($NAME.text), +1);
  				
    				symbol_table_used.set(symbol_table.indexOf($NAME.text), true);
    			}
    			else
    			{
    				System.err.println("Variable " + $NAME.text + " undefined");
    				System.exit(1);
    			}
    		}
    |	READ_INT 
    	{
    		emit("invokestatic Runtime/readInt()I", +1);

        }
;