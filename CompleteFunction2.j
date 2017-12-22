.source CompleteFunction2.naja
.class  public CompleteFunction2
.super  java/lang/Object

.method public <init>()V
    aload_0
    invokenonvirtual java/lang/Object/<init>()V
    return
.end method

.method public static greater(II)I
    ; if a > b:
    iload  0
    iload  1
    if_icmple NOT_IF_1
    
    ; c = a
    iload  0
    istore 2
    goto END_ELSE_1
    
NOT_IF_1:

    ; c = b
    iload  1
    istore 2

END_ELSE_1:

    ; return c
    iload  2
    ireturn

    return
.limit locals 3
.limit stack  2
.end method

.method public static main([Ljava/lang/String;)V
    ; x = 8
    ldc    8
    istore 1
    
    ; print maior(4, x)
    getstatic java/lang/System/out Ljava/io/PrintStream;
    ldc    4
    iload  1
    invokestatic CompleteFunction2/greater(II)I
    invokevirtual java/io/PrintStream/println(I)V

    return
.limit locals 2
.limit stack  3
.end method

