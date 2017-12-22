grammar Dubem;

/*---------------- COMPILER INTERNALS ----------------*/

@header
{
  import java.util.ArrayList;
}

@members
{
  private static ArrayList<String> symbol_table;

  private static ArrayList<String> symbol_table_not_used;

  private static ArrayList<Character> symbol_type;

  private static ArrayList<Boolean> symbol_used;
  
  private static ArrayList<String> symbol_functions;
  
  private static ArrayList<String> symbol_name;
  
  private static int count_while = 0;

  private static int count_if = 0;

  private static int count_for = 0;

  private static int stack_cur, stack_max, errors;

  private static boolean isArray = false;

  private static void emit(String bytecode, int delta) {

    System.out.println("   " + bytecode + "   ;  " + delta);
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
    symbol_table_not_used = new ArrayList<String>();
    symbol_type = new ArrayList<Character>();
    symbol_used = new ArrayList<Boolean>();
    symbol_functions = new ArrayList<String>();
    symbol_name = new ArrayList<String>();

    parser.program();

    if(errors > 0)
      System.exit(1);

  }
}

/*---------------- LEXER RULES ----------------*/

PLUS         : '+' ;
MINUS        : '-' ;
TIMES        : '*' ;
OVER         : '/' ;
REMAINDER    : '%' ;
OPEN_P       : '(' ;
CLOSE_P      : ')' ;
ATTRIB       : '=' ;
SEMICOLON    : ';' ;
COMMA        : ',' ;

PROCEDURE : 'procedure';
FUNCTION  : 'function';
RETURN    : 'return';

EQ           : '==' ;
NE           : '!=' ;
LT           : '<' ;
LE           : '<=' ;
GT           : '>' ;
GE           : '>=' ;
OPEN_B       : '[' ;
CLOSE_B      : ']' ;

PRINT        : 'print';
READ_INT     : 'read_int';
READ_STRING  : 'read_string';
STRING       : '"' ~('"')* '"';

ARRAY        : 'array' ;
LENGTH       : 'length' ;

IF           : 'if';
ELSE         : 'else';
END          : 'end';

WHILE        : 'while';
FOR          : 'for';

NUMBER       : '0'..'9'+ ;
NAME         : 'a'..'z'+ ;
SPACE        : (' '|'\t')+ { skip(); } ;
NL           : ('\r')?'\n' ;

COMMENT      : '#' ~('\n')* { skip(); };

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
}   

( procedure | function | NL )* main

;



procedure
: PROCEDURE NAME OPEN_P ( parameters )? CLOSE_P NL 
{ 
  String tmpI = "";

  if( symbol_table.size() > 0 )
  {   
    for( int i = 0; i < symbol_table.size(); i++ )
    {
      tmpI = "I" + tmpI;
    }

    System.out.println(".method public static " + $NAME.text + "(" + tmpI + ")V");
    System.out.println("");

    symbol_functions.add( tmpI );
    symbol_name.add( $NAME.text );
  }
  else
  {
    System.out.println(".method public static " + $NAME.text + "()V");
    System.out.println("");

    symbol_functions.add( tmpI );
    symbol_name.add( $NAME.text );
  }
}
( statement )*
{
  System.out.println("");
  System.out.println("  return");
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
: FUNCTION NAME OPEN_P ( parameters )? CLOSE_P NL 
{ 
  String tmpI = "";

  if( symbol_table.size() > 0 )
  {   
    for( int i = 0; i < symbol_table.size(); i++ )
    {
      tmpI = "I" + tmpI;
    }

    System.out.println(".method public static " + $NAME.text + "(" + tmpI + ")I");
    System.out.println("");

    symbol_functions.add( tmpI );
    symbol_name.add( $NAME.text );
  }
  else
  {
    System.out.println(".method public static " + $NAME.text + "()I");
    System.out.println("");

    symbol_functions.add( tmpI );
    symbol_name.add( $NAME.text );
  }
}
( statement )*
{
  System.out.println("");
  System.out.println("  return");
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
:  NAME 
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
  symbol_table.add("args");
  symbol_type.add('-');
  System.out.println(".method public static main([Ljava/lang/String;)V");

}
(statement)*
{
  for(int i = 0; i < symbol_table_not_used.size(); i++)
  {

    System.err.println("WARNING: did not use "+symbol_table_not_used.get(i));
    errors++;

  }
  
  System.out.println("  return"); 
  System.out.println(".limit stack"+ " " + stack_max); 
  System.out.println(".limit locals"+ " " + symbol_table.size()); 
  System.out.println(".end method");
}  
;
statement
: NL | st_print | st_attrib NL | st_while | st_for | st_if | st_for | st_call | st_return
;
st_print
: PRINT
{

  emit("getstatic java/lang/System/out Ljava/io/PrintStream;", +1);

}
e1 = exp_arithmetic 
{

  if( $e1.type == 'i')
    emit(" invokevirtual java/io/PrintStream/print(I)V\n", -2);
  else
    emit(" invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);

}
(
  COMMA 
  { emit("getstatic java/lang/System/out Ljava/io/PrintStream;", +1); } 

  e2 = exp_arithmetic
  { 

    if($e2.type == 'i')
      emit(" invokevirtual java/io/PrintStream/print(I)V\n", -2);
    else
      emit(" invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n", -2);
    
  }

  )* NL
{
  emit("getstatic java/lang/System/out Ljava/io/PrintStream;", +1);
  emit(" invokevirtual java/io/PrintStream/println()V\n", -1);
}
;
st_attrib
: NAME ( OPEN_B 
{
 if (symbol_table.indexOf($NAME.text) == -1) {
   System.err.println("Undefined variable:" + $NAME.text );
   System.exit(1);
 }

 int end = symbol_table.indexOf($NAME.text);

 if (symbol_type.get(end) != 'v' ) {
  System.err.println("is not a vector");
  System.exit('1');
}

emit("aload " + end, -1);
}

e2 = exp_arithmetic CLOSE_B )? ATTRIB
( e1 = exp_arithmetic
{

  if(symbol_table.indexOf($NAME.text) == -1){
    symbol_table.add($NAME.text);
    symbol_table_not_used.add($NAME.text);

    if($e1.type == 'i')
      symbol_type.add('i');
    else if ($e1.type == 'a')
      symbol_type.add('a');

  }

  int end = symbol_table.indexOf($NAME.text);
  if (symbol_type.get(end) == 'i') {
    emit("istore " + end, -1);
  } else if (symbol_type.get(end) == 'a') {
    emit("astore " + end, -1);
  } else {
    emit ("iastore", -3);
  }
  System.out.println();
}

|ARRAY exp_arithmetic
{       
  emit("newarray int", 0);
  symbol_table.add($NAME.text);
  symbol_type.add('v');
  emit("astore " + symbol_table.indexOf($NAME.text), -1);
  System.out.println(); 
} 
)
;
st_while
: WHILE 
{
  int local = ++count_while;
  System.out.println("BEGIN_WHILE_"+local+":");
}
s = exp_comparison NL 
{
  emit($s.bytecode + " END_WHILE_" +local, -2);
}
(statement)*
{ emit("goto BEGIN_WHILE_"+local, 0); }
END NL
{ System.out.println("END_WHILE_"+local+":"); }
;
st_if
: IF 
{ int local = ++count_if; }
s = exp_comparison  NL
{ emit($s.bytecode + " NOT_IF"+local, -2); }
(statement)*
{ 
  emit("goto END_ELSE"+local, 0);
  System.out.println("NOT_IF"+local+":");
}
(ELSE NL (statement)* )?
{ System.out.println("END_ELSE"+local+":"); }
END NL    
;
st_for
: FOR
{ int local = ++count_for; }
st_attrib SEMICOLON
{ System.out.println("FOR_COMP_"+local+":"); }
s = exp_comparison SEMICOLON
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


st_call
:   NAME OPEN_P ( arguments )? CLOSE_P NL
  {   
    int position = symbol_name.indexOf( $NAME.text );
    
    System.out.println( "invokestatic Test/" + $NAME.text + "(" + symbol_functions.get(position) + ")V" );
  }
;
st_return
: RETURN exp_arithmetic NL
  {
    emit("  ireturn", -1);
  }
;

arguments
:
exp_arithmetic ( COMMA exp_arithmetic )*
;

exp_comparison returns [String bytecode]
: e1 = exp_arithmetic op = ( EQ | NE | LT | LE | GT | GE ) e2 = exp_arithmetic
{
  if($e1.type != $e2.type)
  {
    System.err.println("ERROR: can not mix types");
    errors++;
  }

  if($op.type == EQ)      $bytecode = "if_icmpne"; 
  else if($op.type == NE) $bytecode = "if_icmpeq";
  else if($op.type == LT) $bytecode = "if_icmpge";
  else if($op.type == LE) $bytecode = "if_icmpgt";
  else if($op.type == GT) $bytecode = "if_icmple";
  else if($op.type == GE) $bytecode = "if_icmplt";  
}
;
exp_arithmetic returns [char type]
:   t1 = term ( op = ( PLUS | MINUS ) t2 = term 
{ 
  if($t1.type != $t2.type)
  {
    System.err.println("ERROR: cannot mix types");
    errors++;
  }

  emit($op.type == PLUS ? "iadd" : "isub", -1);
} 
)*
{ $type = $t1.type; }

;
term returns [char type]  
:   f1 = factor ( op = ( TIMES  | OVER | REMAINDER) f2 = factor 
{ 
  if($f1.type == 'a' || $f2.type == 'a')
  {
    System.err.println("ERROR: cannot mix types");
    errors++;
  }

  emit($op.type == TIMES ? "imul" :
    ($op.type == OVER ? "idiv": "irem"), -1);
} 
)*
{ $type = $f1.type; }
;
factor returns [char type]
:   NUMBER
{ 
  emit(" ldc " + $NUMBER.text, +1);
  $type = 'i';
}
| OPEN_P exp_arithmetic CLOSE_P
{
  $type = $exp_arithmetic.type;
}
|   NAME ( OPEN_B 

{
 int end = symbol_table.indexOf($NAME.text);

 if (symbol_type.get(end) != 'v' ) {
  System.err.println("is not a vector");
  System.exit('1');
}

emit("aload " + end, -1);
}

exp_arithmetic CLOSE_B )?
{
  if(symbol_table.indexOf($NAME.text) >= 0){

    if ((symbol_type.get(symbol_table.indexOf($NAME.text)) == 'v')) {
      emit(" iaload ", -1);      
      $type = 'i';
    } else {
     emit(" " + symbol_type.get(symbol_table.indexOf($NAME.text)) + "load " + symbol_table.indexOf($NAME.text), +1);
     symbol_table_not_used.remove($NAME.text);
     $type = symbol_type.get(symbol_table.indexOf($NAME.text));
   }
 }
 else
 { 
  System.err.println("WARNING: Used non declared variable "+$NAME.text);
  errors++;
}
}
|   READ_INT
{ 
  emit(" invokestatic Runtime/readInt()I", +1);
  $type = 'i';
}
|   READ_STRING
{
  $type = 'a';
}
|   STRING
{
  emit(" ldc " + $STRING.text, +1); 
  $type = 'a';
}
|   LENGTH NAME
{
  //ver se esta na tabela de simbolos
  int end = symbol_table.indexOf($NAME.text);

  emit("aload " +  end, +1);
  emit("arraylength", +0); 
  $type = 'i';
}
|
t2 = NAME OPEN_P ( arguments )? CLOSE_P   
{
  int end = symbol_name.indexOf( $t2.text );

  System.out.println( "invokestatic Test/" + $t2.text + "(" + symbol_functions.get(end) + ")I" );
  $type = 'i';
}  
;