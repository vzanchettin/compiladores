.source Test.j
.class public Test
.super  java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
    ldc 4
   istore 1
    iload 1
    ldc 4
   if_icmpne NOT_IF
   getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    ldc 6
   iadd
   invokevirtual java/io/PrintStream/print(I)V

   getstatic java/lang/System/out Ljava/io/PrintStream;
    invokevirtual java/io/PrintStream/println()V

   goto END_ELSE
NOT_IF:
END_ELSE:
  return
.limit stack 3
.limit locals 2
.end method
; symbols: [args, a]
; symbols: [true, true]
