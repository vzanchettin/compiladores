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

  private static int count_while = 0;

  private static int count_if = 0;

  private static int count_for = 0;

  private static int stack_cur, stack_max, errors;

  private static void emit(String bytecode, int delta) {

  private static boolean isArray = false;

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
    symbol_table_not_used = new ArrayList<String>();
    symbol_type = new ArrayList<Character>();
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

EQ           : '==';
NE           : '!=';
LT           : '<' ;
LE           : '<=';
GT           : '>' ;
GE           : '>=';
OPEN_B       : '[' ;
CLOSE_B      : ']' ;

PRINT        : 'print';
READ_INT     : 'read_int';
READ_STRING  : 'read_string';
STRING       : '"' ~('"')* '"';

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
  System.out.println(".method public static main([Ljava/lang/String;)V");

}   

( statement )*

{ 
  for(int i = 0; i < symbol_table_not_used.size(); i++)
  {

    System.err.println("WARNING: did not use "+symbol_table_not_used.get(i));
    errors++;

  }
  
  System.out.println("  return"); 
  System.out.println(".limit stack"+ " " + stack_max); 
  System.out.println(".limit locals"+ " " + symbol_table.size()+1); 
  System.out.println(".end method");
}  
;
statement
: NL | st_print | st_attrib NL | st_while | st_for | st_if
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
: NAME ATTRIB
e1 = exp_arithmetic
{

  if(symbol_table.indexOf($NAME.text) == -1){
    symbol_table.add($NAME.text);
    symbol_table_not_used.add($NAME.text);

    if($e1.type == 'i')
      symbol_type.add('i');
    else
      symbol_type.add('a');
    
  }
  else
  {

    if(symbol_type.get(symbol_table.indexOf($NAME.text)) != $e1.type)

    {
      if($e1.type == 'i')
      {

        System.err.println("ERROR: "+$NAME.text+" is an string");
        errors++;

      }
      else
      {

        System.err.println("ERROR: "+$NAME.text+" is an integer");
        errors++;

      }
    }
  }

  emit(symbol_type.get(symbol_table.indexOf($NAME.text)) + "store " + symbol_table.indexOf($NAME.text), -1);
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
|   NAME
{
  if(symbol_table.indexOf($NAME.text) >= 0){
    emit(" " + symbol_type.get(symbol_table.indexOf($NAME.text)) + "load " + symbol_table.indexOf($NAME.text), +1);
    symbol_table_not_used.remove($NAME.text);
    $type = symbol_type.get(symbol_table.indexOf($NAME.text));
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
;