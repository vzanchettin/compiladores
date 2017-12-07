.source SimpleFunction.naja
.class  public SimpleFunction
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static cubo()V
    ; n = 4
    ldc 4
    istore 0

    ; print n * n * n
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 0
    iload 0
    imul
    iload 0
    imul
    invokevirtual java/io/PrintStream/println(I)V

    return
.limit locals 1
.limit stack  3
.end method

.method public static main([Ljava/lang/String;)V
    ; n = 1
    ldc 1
    istore 1

    ; cubo()
    invokestatic SimpleFunction/cubo()V

    ; print n
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload 1
    invokevirtual java/io/PrintStream/println(I)V

    return
    .limit locals 2
    .limit stack  2
.end method
