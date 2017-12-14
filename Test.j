.source Test.j
.class public Test
.super  java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
   getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc "array size?"
    invokevirtual java/io/PrintStream/print(Ljava/lang/String;)V

   getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    invokestatic Runtime/readInt()I
   istore 1

    iload 1
   newarray int
   astore 2

    ldc 0
   istore 3

BEGIN_WHILE_1:
    iload 3
   aload 2
   arraylength
   if_icmpge END_WHILE_1
   aload 2
    iload 3
    iload 3
    ldc 1
   iadd
    iload 3
    ldc 1
   iadd
   imul
   iastore

    iload 3
    ldc 1
   iadd
   istore 3

   goto BEGIN_WHILE_1
END_WHILE_1:
   aload 2
   arraylength
    ldc 1
   isub
   istore 3

BEGIN_WHILE_2:
    iload 3
    ldc 0
   if_icmplt END_WHILE_2
   getstatic java/lang/System/out Ljava/io/PrintStream;
   aload 2
    iload 3
    iaload 
    invokevirtual java/io/PrintStream/print(I)V

   getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

    iload 3
    ldc 1
   isub
   istore 3

   goto BEGIN_WHILE_2
END_WHILE_2:
  return
.limit stack 31
.limit locals 4
.end method
