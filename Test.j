.source Test.j
.class public Test
.super  java/lang/Object
.method public <init>()V
aload_0
invokenonvirtual java/lang/Object/<init>()V
return
.end method
.method public static main([Ljava/lang/String;)V
    ldc 1
    ldc 2
    ldc 3
   imul
   iadd
   istore 1

    ldc "xyz"
   astore 2

    ldc 10
   newarray int
   astore 3

   aload 3
    ldc 7
    ldc 9
   iastore

  return
.limit stack 3
.limit locals 41
.end method
