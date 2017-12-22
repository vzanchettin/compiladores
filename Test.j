.source Test.j
.class public Test
.super  java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static greater(II)I

    iload 0   ;  1
    iload 1   ;  1
   if_icmple NOT_IF1   ;  -2
    iload 0   ;  1
   istore 2   ;  -1

   goto END_ELSE1   ;  0
NOT_IF1:
    iload 1   ;  1
   istore 2   ;  -1

END_ELSE1:
    iload 2   ;  1
     ireturn   ;  -1

  return
.limit locals 3
.limit stack 2
.end method

.method public static main([Ljava/lang/String;)V
    ldc 8   ;  1
   istore 1   ;  -1

   getstatic java/lang/System/out Ljava/io/PrintStream;   ;  1
    ldc 4   ;  1
    iload 1   ;  1
invokestatic Test/greater(II)I
    invokevirtual java/io/PrintStream/print(I)V
   ;  -2
   getstatic java/lang/System/out Ljava/io/PrintStream;   ;  1
    invokevirtual java/io/PrintStream/println()V
   ;  -1
  return
.limit stack 3
.limit locals 2
.end method
