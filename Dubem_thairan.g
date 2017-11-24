grammar Dubem;

/*---------------- COMPILER INTERNALS ----------------*/

@header
{
    import java.util.ArrayList;
}

@members
{
    private static ArrayList<String> symbol_table;
    private static ArrayList<Boolean> used_variables;    
    private static int stack_cur, stack_max, while_counter, if_counter, count_for;
    private static void emit(String bytecode, int delta) {   
        System.out.println("    "+bytecode);        
        stack_cur += delta;
        if(stack_cur > stack_max) {
            stack_max = stack_cur;
        }
    }

    public static void main(String[] args) throws Exception
    {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        DubemLexer lexer = new DubemLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DubemParser parser = new DubemParser(tokens);

	used_variables = new ArrayList<Boolean>();  
	used_variables.add(true);        
	symbol_table = new ArrayList<String>();           
        symbol_table.add("args");   
        parser.program();
	
	for (int i = 0; i < used_variables.size(); i++){			
		if (!used_variables.get(i)){
			System.err.println("Unused variable: " + symbol_table.get(i));
		}
	}	
        //System.out.println("; symbols: " + symbol_table);
    }
}

/*---------------- LEXER RULES ----------------*/

PLUS            : '+' ;
MINUS           : '-' ;
OVER            : '/' ;
TIMES           : '*' ;
REMAINDER       : '%' ;
OPEN_P          : '(' ;
CLOSE_P         : ')' ;
ATTRIB          : '=' ;
SEMI_COLON	: ';' ; 

EQ	        : '==' ;
NE              : '!=' ;
LT              : '<'  ;
LE              : '<=' ;
GT              : '>'  ;
GE              : '>=' ;

COMMA		: ',';
PRINT           : 'print';
READ_INT	: 'read_int';
READ_STRING	: 'read_string';
WHILE		: 'while' ;
IF		: 'if';
ELSE		: 'else';
FOR		: 'for';
END		: 'end' ;

STRING          : '"' ~('"')* '"' ;
COMMENT         : '#' ~('\n')* {skip(); } ;
SPACE           : (' '|'\t')+ { skip(); } ;

NL              : ('\r')?'\n' ;
NAME            : 'a'..'z'+;
NUMBER          : '0'..'9'+ ;

program
    :   
        {
            System.out.println(".source Test.j");
            System.out.println(".class  public Test");
            System.out.println(".super  java/lang/Object");
            System.out.println("");
            System.out.println(";");
            System.out.println("; initializes java.lang.Object");
            System.out.println(";");
            System.out.println(".method public <init>()V");
            System.out.println("aload_0");
            System.out.println("invokenonvirtual java/lang/Object/<init>()V");
            System.out.println("return");
            System.out.println(".end method");
            System.out.println("");
            System.out.println("");
            System.out.println(".method public static main([Ljava/lang/String;)V");
            System.out.println("");
        }
        ( statement )*
        {
            System.out.println("");
            System.out.println("; end of method");
            System.out.println("return");
            System.out.println("");
            System.out.println(".limit stack "+stack_max);
            System.out.println(".limit locals "+symbol_table.size());
            System.out.println(".end method");
        }
    ;

statement
    :
        NL | st_print | st_attrib NL | read_int | st_while | st_if | st_for
    ;

st_print
    :
        PRINT
        {
            emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);
        }
        e1 = exp_arithmetic 
        {
	if ($e1.type == 'a'){
	    emit("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V", -2);
	}else
            emit("invokevirtual java/io/PrintStream/print(I)V", -2);
        }
	(COMMA
	{
            emit("getstatic java/lang/System/out Ljava/io/PrintStream;", 1);
            System.out.println("\t");
	}
        e2 = exp_arithmetic  
        {
	if ($e1.type == 'a'){
	    emit("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V", -2);
	}else
            emit("invokevirtual java/io/PrintStream/print(I)V", -2);
        }
	)*
	NL
    ;

st_attrib
    :  
        NAME ATTRIB exp_arithmetic
        {
            String var = $NAME.text;
            if(!symbol_table.contains(var)) {
                symbol_table.add(var);
		used_variables.add(false);
                int i = symbol_table.indexOf(var);
                emit("istore "+i + "\n", -1);
            } else {
                int i = symbol_table.indexOf(var);
                emit("istore "+i + "\n", -1);
            }
        }
    ;
	
read_int
	:
	READ_INT
	{
            System.out.println("\t");
	    emit("invokestatic Runtime/readInt()I", +1);
	}
	;

st_while
	:
	WHILE 
	    { int local = while_counter + 1; 
		System.out.println("BEGIN_WHILE_" + local + ":"); }
	
	s = exp_comparison NL
	{ emit($s.bytecode + " END_WHILE_" + local, -2);} 
	
	(statement)* 
	END NL
	    { System.out.println("    goto BEGIN_WHILE_" + local); 
   	      System.out.println("END_WHILE_" + local + ":");
	    }
	;

st_if
	:
	IF 
	    { int local = if_counter + 1;  boolean has_else = false; }

	s = exp_comparison NL
	{ emit($s.bytecode + " NOT_IF_" + local, -2);} 
	
	(statement)* 

	( ELSE NL 
	  {has_else = true;
	   System.out.println("goto END_ELSE_" + local);
           System.out.println("NOT_IF_" + local + ":");
          }
          (statement)*)?

	END NL
	    { if (has_else) 
                 System.out.println("END_ELSE_" + local + ":");
              else
	         System.out.println("NOT_IF_" + local + ":"); 
            }
	;

st_for
	: FOR
	{ int local = ++count_for; }
	st_attrib SEMI_COLON
		{ System.out.println("FOR_COMP_"+local+":"); }
	s = exp_comparison SEMI_COLON
		{ 
			emit($s.bytecode + " END_FOR_"+local, -2);
			emit("goto FOR_"+local, 0);
			System.out.println("FOR_INC_"+local+":");
		}
	st_attrib NL
		{ 
			emit("goto FOR_COMP_"+local, 0);
			System.out.println("FOR_"+local+":"); 
		}
	(statement)*
		{ 
			emit("goto FOR_INC_"+local, 0);
			System.out.println("END_FOR_"+local+":"); 
		}
	END NL
;

exp_comparison returns [String bytecode]
	: exp_arithmetic op = ( EQ | NE | GT | GE | LT | LE) exp_arithmetic
	    { $bytecode = ($op.type == EQ ? "if_icmpne" : $op.type == NE ? "if_icmpeq" : 
          	   $op.type == GT ? "if_icmple" : $op.type == GE ? "if_icmplt" : 
		   $op.type == LT ? "if_icmpge" : "if_icmpgt");
	    }
	;

exp_arithmetic returns [char type]
    :   t1 = term ( op = (PLUS | MINUS) t2 = term 
             { emit($op.type == PLUS ? "iadd" : "isub", -1); } 
        )*
	{ $type = $t1.type; } 
    ;

term returns [char type]   
    :   f1 = factor ( op = (TIMES | OVER | REMAINDER) f2 = factor 
              { emit($op.type == TIMES ? "imul" : $op.type == OVER ? "idiv" : "irem", -1); }
        )*
	{ $type = $f1.type; }
    ;
    
factor returns [char type]
    :   NUMBER
            { emit("ldc " + $NUMBER.text, 1); 
	      $type = 'i';
	    }
        | OPEN_P exp_arithmetic CLOSE_P
	    { $type = $exp_arithmetic.type; }
        | NAME
        {String var = $NAME.text;
		if (symbol_table != null){
			if(symbol_table.contains(var)) {
				int i = symbol_table.indexOf(var);
				emit("iload "+i, 1);
				used_variables.set(i, true);
			} else {
				System.err.println("non-existent variable: " + var);
				System.exit(1);
				}
			} else {
				System.err.println("non-existent variable: " + var);
				System.exit(1);
			}
		$type = 'i';
        }
	| READ_INT
	{
		emit("invokestatic Runtime/readInt()I", +1);
	}
	| STRING
	    {
	      emit("ldc " + $STRING.text, +1);
	      $type = 'a';
	    }
    ;
