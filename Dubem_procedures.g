grammar Dubem;

/*---------------- COMPILER INTERNALS ----------------*/

@header
{
    import java.util.ArrayList;
}

@members
{
    private static ArrayList<String> symbol_table;
	private static ArrayList<Boolean> symbol_used;
	private static ArrayList<Character> symbol_type;
	private static ArrayList<String> symbol_functions;
	private static ArrayList<String> symbol_name;
	
	private static int stack_cur, stack_max, i, count_while, count_if, count_for, novo;
	private static boolean withElse, isVector;
	
	private static void emit( String bytecode, int delta )
	{
		System.out.println( "	" + bytecode + " ; " + delta);
		stack_cur += delta;
		if( stack_max < stack_cur ){ stack_max = stack_cur; }
	}
	
    public static void main(String[] args) throws Exception
    {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        DubemLexer lexer = new DubemLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DubemParser parser = new DubemParser(tokens);

        symbol_table = new ArrayList<String>();
		symbol_used = new ArrayList<Boolean>();
		symbol_type = new ArrayList<Character>();
		symbol_functions = new ArrayList<String>();
		symbol_name = new ArrayList<String>();
		
		count_while = 0;
		count_if = 0;
		count_for = 0;
		novo = 0;
		withElse = false;
		isVector = false;
							
        parser.program();
		
        System.out.println("; symbols: " + symbol_table );
		System.out.println("; type: " + symbol_type );
		System.out.println("; used: " + symbol_used );
		System.out.println("; functions: " + symbol_functions );
		System.out.println("; functions: " + symbol_name );
		
		for( i = 0; i < symbol_used.size(); i++ )
		{
			if( !symbol_used.get( i ) )
			{
				System.out.println( "; Not used " + symbol_table.get( i ) );
			}			
		}
		
    }
	
}

/*---------------- LEXER RULES ----------------*/

PLUS    	: '+' ;
MINUS		: '-' ;
TIMES   	: '*' ;
OVER		: '/' ;
REMAINDER	: '%' ;
OPEN_P  	: '(' ;
CLOSE_P 	: ')' ;
OPEN_C  	: '[' ;
CLOSE_C 	: ']' ;
ATTRIB		: '=' ;
COMMA		: ',' ;
SEMI_COLON	: ';' ;

LT			: '<' ;
LE			: '<=';
GT			: '>' ;
GE			: '>=';
EQ			: '==';
NE			: '!=';

PRINT		: 'print' ;
READ_INT	: 'read_int' ;
WHILE		: 'while' ;
END			: 'end' ;
IF			: 'if' ;
ELSE		: 'else' ;
FOR			: 'for' ;
READ_STRING	: 'read_str' ;
ARRAY		: 'array' ;
LENGTH		: 'length';

PROCEDURE	: 'procedure';
FUNCTION	: 'function';
RETURN		: 'return';

COMMENT		: '#' ~('\n')* { skip(); } ;

STRING		: '"' ~('"')* '"' ;
NAME		: 'a'..'z'+ ;
NUMBER     	: '0'..'9'+ ;
SPACE   	: (' '|'\t')+ { skip(); } ;
NL			: ( '\r' )? '\n' ;


/*---------------- PARSER RULES ----------------*/

program
    :   
	{
		System.out.println(".source Test.j");
		System.out.println(".class  public Test");
		System.out.println(".super  java/lang/Object");
		System.out.println("");
		System.out.println(".method public <init>()V");
		System.out.println("	aload_0");
		System.out.println("	invokenonvirtual java/lang/Object/<init>()V");
		System.out.println("	return");
		System.out.println(".end method");
		System.out.println("");		
	}
	( procedure | function | NL )* main
    ;

procedure
	:	 
	PROCEDURE NAME OPEN_P ( parameters )? CLOSE_P NL
	{	
		String qtdI = "";
		
		if( symbol_table.size() > 0 )
		{		
			for( int i = 0; i < symbol_table.size(); i++ )
			{
				qtdI = "I" + qtdI;
			}
			
			System.out.println(".method public static " + $NAME.text + "(" + qtdI + ")V");
			System.out.println("");
			
			symbol_functions.add( qtdI );
			symbol_name.add( $NAME.text );
		}
		else
		{
			System.out.println(".method public static " + $NAME.text + "()V");
			System.out.println("");
			
			symbol_functions.add( qtdI );
			symbol_name.add( $NAME.text );
		}
	}
	( statement )*
	{
		System.out.println("");
		System.out.println("	return");
		System.out.println("");
		System.out.println(".limit locals " + symbol_table.size());
		System.out.println(".limit stack " + stack_max);
		System.out.println(".end method");
		System.out.println("");	
		
		symbol_table.clear();
		symbol_used.clear();
		symbol_type.clear();
		
		stack_cur = 0;
		stack_max = 0;
		
	}
	END NL
	;
	
function
	:	 
	FUNCTION NAME OPEN_P ( parameters )? CLOSE_P NL
	{	
		String qtdI = "";
		
		if( symbol_table.size() > 0 )
		{		
			for( int i = 0; i < symbol_table.size(); i++ )
			{
				qtdI = "I" + qtdI;
			}
			
			System.out.println(".method public static " + $NAME.text + "(" + qtdI + ")I");
			System.out.println("");
			
			symbol_functions.add( qtdI );
			symbol_name.add( $NAME.text );
		}
		else
		{
			System.out.println(".method public static " + $NAME.text + "()I");
			System.out.println("");
			
			symbol_functions.add( qtdI );
			symbol_name.add( $NAME.text );
		}
	}
	( statement )*
	{
		System.out.println("");
		System.out.println("	return");
		System.out.println(".limit locals " + symbol_table.size());
		System.out.println(".limit stack " + stack_max);
		System.out.println(".end method");
		System.out.println("");	
		
		symbol_table.clear();
		symbol_used.clear();
		symbol_type.clear();
		
		stack_cur = 0;
		stack_max = 0;
	}
	END NL
	;

parameters
	:	
	NAME 
	{		
		symbol_table.add( $NAME.text );
		symbol_used.add( false );
		symbol_type.add( 'i' );			
	}	
	( COMMA NAME 
	{		
		symbol_table.add( $NAME.text );
		symbol_used.add( false );
		symbol_type.add( 'i' );			
	}
	)*
	;
	
main
	:
	{	
		symbol_table.add( "args" );	
		symbol_used.add( true );
		symbol_type.add( 'i' );		
		
		System.out.println(".method public static main([Ljava/lang/String;)V");
		System.out.println("");
	}
	( statement )*
	{
		System.out.println("");
		System.out.println("	return");
		System.out.println("");
		System.out.println(".limit locals " + symbol_table.size());
		System.out.println(".limit stack " + stack_max);
		System.out.println(".end method");
		System.out.println("");	
	}
	;
	
statement
	:	NL | st_print | st_attrib NL | st_while | st_if | st_for | st_call | st_return
	;
	
st_print
	:	PRINT
		{
			emit( "getstatic java/lang/System/out Ljava/io/PrintStream;", +1 );
		}
		e1 = exp_arithmetic 
		{
			if( $e1.type == 'a' )
			{
				emit( "invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2 );				
			}
			if( $e1.type == 'i' )
			{
				emit( "invokevirtual java/io/PrintStream/print(I)V\n", -2 );				
			}
		}		
		( COMMA 		
			{
				emit( "getstatic java/lang/System/out Ljava/io/PrintStream;", +1 );
			} 
			e2 = exp_arithmetic 
			{
				if( $e2.type == 'a' )
				{
					emit( "invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2 );				
				}
				if( $e2.type == 'i' )
				{
					emit( "invokevirtual java/io/PrintStream/print(I)V\n", -2 );
				}
			} 
		)* NL
			{
				emit( "getstatic java/lang/System/out Ljava/io/PrintStream;", +1 );
				emit( "invokevirtual java/io/PrintStream/println()V\n", -1 );
			}
	;
	
st_attrib
	:	NAME 
	(
		OPEN_C
		{
			isVector = true;
			if ( !symbol_table.contains( $NAME.text ) )
			{
				System.err.println( "This variable not declarated [" + $NAME.text + "]" );
				System.exit( 1 );
			}
			else
			{
				emit( "aload " + symbol_table.indexOf( $NAME.text ), +1 );
			}
		}
		e1 = exp_arithmetic CLOSE_C
	)?
		ATTRIB 		
	(	
		e2 = exp_arithmetic
		{ 
		    if ( !symbol_table.contains( $NAME.text ) )
			{
				symbol_table.add( $NAME.text );
				symbol_used.add( false );
								
				if( $e2.type == 'a' )
				{
					symbol_type.add( 'a' );
				}
				if( $e2.type == 'i' )
				{
					symbol_type.add( 'i' );
				}
			}	
			if( isVector )
			{
				System.out.println( "iastore" ); 
			}
			else
			{
				if( $e2.type == 'a' )
				{
					emit( "astore " + symbol_table.indexOf( $NAME.text ), -1 ); 	
				}
				if( $e2.type == 'i' )
				{
					emit( "istore " + symbol_table.indexOf( $NAME.text ), -1 ); 	
				}						
			}
		}
	|	ARRAY e3 = exp_arithmetic
		{
			if ( !symbol_table.contains( $NAME.text ) )
			{
				symbol_table.add( $NAME.text );
				symbol_used.add( false );
				symbol_type.add( 'v' );
				
				if( $e3.type == 'i' )
				{					
					emit( "newarray int", 0 );
					emit( "astore " + symbol_table.indexOf( $NAME.text ), -1 );
				}
				else
				{
					System.err.println( "ERROR: [" + $NAME.text + "] is not a integer" );
					System.exit( 1 );
				}
			}
			else
			{
				System.err.println( "ERROR: [" + $NAME.text + "] yet used" );
				System.exit( 1 );
			}
		}
	)
	;
	
st_while
	:	WHILE 
			{ 
				int local = count_while++;				
				System.out.println( "BEGIN_WHILE_" + local + ":" );
			}
			s = exp_comparison NL 
			{ 
				emit( $s.bytecode + "END_WHILE_" + local, -2 );
			}
			( statement )* 
		END NL
			{ 
				System.out.println( "goto BEGIN_WHILE_" + local );
			}		
			{ 
				System.out.println( "END_WHILE_" + local + ":" );				
			}		
	;
	
st_if
	:	IF 
			s =	exp_comparison NL 
			{ 		
				withElse = false;
				int local = ++count_if;
				
				emit( $s.bytecode + "NOT_IF_" + local, -2 ); 
			}
			( statement )* 
			(
				ELSE NL
				{
					withElse = true;
					System.out.println( "goto END_ELSE_" + local ); 
				}
				{ 
					System.out.println( "NOT_IF_" + local + ":" );  					
				}
				( statement )*
				{
					System.out.println( "END_ELSE_" + local + ":" );
				}	
			)?
		END NL
			{ 
				if( !withElse )
				{
					System.out.println( "NOT_IF_" + local + ":" );  					
				}				
			}				
	;
	
st_for
	:	FOR 
			st_attrib SEMI_COLON
			{ 
				int local = count_for++;				
				System.out.println( "BEGIN_FOR_" + local + ":" );
			}
			s = exp_comparison SEMI_COLON 
			{ 
				emit( $s.bytecode + "END_FOR_" + local, -2 );
				System.out.println( "goto STAT_FOR_" + local );
				System.out.println( "ST_FOR_" + local + ":");
			}	
			st_attrib NL
			{
				System.out.println( "goto BEGIN_FOR_" + local );
				System.out.println( "STAT_FOR_" + local + ":" );
			}
			( statement )*			
		END	NL
			{ 
				System.out.println( "goto ST_FOR_" + local );
			}		
			{ 
				System.out.println( "END_FOR_" + local + ":" );
			}				
	;	

st_call
	:
	NAME OPEN_P ( arguments )? CLOSE_P NL
	{		
		int position = symbol_name.indexOf( $NAME.text );
		
		System.out.println( "invokestatic Test/" + $NAME.text + "(" + symbol_functions.get(position) + ")V" );
	}	
	;
	
st_return
	:
	RETURN exp_arithmetic NL
	{
		emit("	ireturn", -1);
	}
	;
	
arguments
	:
	exp_arithmetic ( COMMA exp_arithmetic )*
	;	
	
exp_comparison returns [String bytecode]
	:	e1 = exp_arithmetic ( op = ( EQ | NE | LT | LE | GT | GE ) ) e2 = exp_arithmetic 
		{
			if( $e1.type == 'a' || $e2.type == 'a' )
			{
				System.err.println( "ERROR: cannot mix types" );					
				System.exit( 1 );
			}
			else
			{
				if( $op.type == EQ )
				{
					$bytecode = "if_icmpne ";				
				}
				if( $op.type == NE )
				{
					$bytecode = "if_icmpeq ";			
				}
				if( $op.type == LT )
				{
					$bytecode = "if_icmpge ";				
				}
				if( $op.type == LE )
				{
					$bytecode = "if_icmpgt ";			
				}
				if( $op.type == GT )
				{
					$bytecode = "if_icmple ";			
				}
				if( $op.type == GE )
				{
					$bytecode = "if_icmplt ";			
				}
			}
		}
	;	
	
exp_arithmetic returns [ char type ]
    :   t1 = term ( op = ( PLUS | MINUS ) t2 = term 
			{ 
				if( $t1.type == 'a' || $t2.type == 'a' )
				{
					System.err.println( "ERROR: cannot mix types" );					
					System.exit( 1 );
				}
				else
				{
					emit( $op.type == PLUS ? "iadd" : "isub", -1 ); 
				}
			} 
		)*
			{ $type = $t1.type; }
    ;

term returns [ char type ]
    :   f1 = factor ( op = ( TIMES | OVER | REMAINDER ) f2 = factor 
			{ 
				if( $f1.type == 'a' || $f2.type == 'a' )
				{
					System.err.println( "ERROR: cannot mix types" );					
					System.exit( 1 );
				}
				else
				{
					emit( $op.type == TIMES ? "imul" : ( $op.type == OVER ? "idiv" : "irem"), -1 ); 
				}
			} 
		)*
			{ $type = $f1.type; }
    ;
    
factor returns [ char type ]
    :   NUMBER
			{ 			
				emit( "ldc " + $NUMBER.text, +1 ); 
				$type = 'i';				
			}
	|   OPEN_P exp_arithmetic CLOSE_P
			{				
				$type = $exp_arithmetic.type;
			}
	|	NAME
			{ 
				//System.out.println("TABLE=" +symbol_table);
				//System.out.println("TYPE=" +symbol_type);
				if( symbol_table.indexOf( $NAME.text ) == -1 )
				{
					System.err.println( "This variable not declarated [" + $NAME.text + "]" );
					System.exit( 1 );
				}
				else
				{
					if( symbol_type.get( symbol_table.indexOf( $NAME.text ) ) == 'a' )
					{
						emit( "aload " + symbol_table.indexOf( $NAME.text ), +1 );
						symbol_used.set( symbol_table.indexOf( $NAME.text ), true );
						$type = 'a';
					}
					if( symbol_type.get( symbol_table.indexOf( $NAME.text ) ) == 'i' )
					{
						emit( "iload " + symbol_table.indexOf( $NAME.text ), +1 );
						symbol_used.set( symbol_table.indexOf( $NAME.text ), true );
						$type = 'i';
					}
					if( symbol_type.get( symbol_table.indexOf( $NAME.text ) ) == 'v' )
					{
						emit( "aload " + symbol_table.indexOf( $NAME.text ), +1 );
						symbol_used.set( symbol_table.indexOf( $NAME.text ), true );
					}
				}		
			}
	(
		OPEN_C exp_arithmetic CLOSE_C
			{								
				emit( "iaload ", -1 );
				$type = 'i';
			}
	)?
	|	STRING
			{
				emit( "ldc " + $STRING.text, +1 ); 
				symbol_type.add( 'a' );
				$type = 'a';				
			}
	|	READ_INT
			{ 
				emit( "invokestatic Runtime/readInt()I\n", +1 ); 
				symbol_type.add( 'i' );
				$type = 'i';
			}
	|	READ_STRING
			{ 
				emit( "invokestatic Runtime/readString()Ljava/lang/String;\n", +1 ); 	
				symbol_type.add( 'a' );
				$type = 'a';				
			}
	|	LENGTH NAME
			{			
				emit( "arraylength", +1 ); 
				symbol_type.add( 'v' );
				$type = 'i';				
			}
	|	n2 = NAME OPEN_P ( arguments )? CLOSE_P		
			{
				//System.out.println("NAMES=" +symbol_name);
				//System.out.println("FUNCTIONS=" +symbol_functions);
				int position = symbol_name.indexOf( $n2.text );
				
				System.out.println( "invokestatic Test/" + $n2.text + "(" + symbol_functions.get(position) + ")I" );
				$type = 'i';
			}        
    ;
