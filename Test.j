.source Test.j
.class public Test
.super  java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
    ldc 15
   istore 0
FOR_COMP_1:
    iload 0
    ldc 0
   if_icmple END_FOR_1
   goto FOR_1
FOR_INC_1:
    iload 0
    ldc 1
   isub
   istore 0
   goto FOR_COMP_1
FOR_1:
   getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 0
    invokevirtual java/io/PrintStream/print(I)V

   getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

   goto FOR_INC_1
END_FOR_1:
  return
.limit stack 2
.limit locals 11
.end method
