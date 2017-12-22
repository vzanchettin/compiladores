.source CompleteFunction1.naja
.class  public CompleteFunction1
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static square(I)V
    ; a = n * n
    iload  0
    iload  0
    imul   
    istore 1

    ; print a
    getstatic java/lang/System/out Ljava/io/PrintStream;
    iload  1
    invokevirtual java/io/PrintStream/println(I)V

    return
.limit locals 2
.limit stack  2
.end method

.method public static main([Ljava/lang/String;)V
    
    ; square(8)
    ldc    8
    invokestatic CompleteFunction1/square(I)V

    return
.limit locals 1
.limit stack  1
.end method

