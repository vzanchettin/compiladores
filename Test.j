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
    ldc 10
   istore 2
    ldc 10
   istore 3
   invokestatic Runtime/readInt()I
   istore 4
   getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 2
    iload 1
   iadd
    iload 1
   iadd
   invokevirtual java/io/PrintStream/println(I)V

  return
.limit stack 3
.limit locals 5
.end method
; symbols: [args, a, b, c, d]
; symbols: [true, true, true, false, false]
