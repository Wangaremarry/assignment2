fun main(){
    surname( "Mary")
    var c=modules(26, 34)
    println(c)
    var g=add(30, 60,47,57)
    println(g)
    var w=printmyfact("i love me")
    println(w)

}
fun surname(name:String){
    println( "Hello"+" " +name)
}
fun modules(a:Int, b:Int):Int{
    var c=a%b
    return c
}
fun add(c:Int, d:Int, e:Int, f:Int):Int{
    var g=(c+d+e+f)
    return g
}
fun printmyfact(fact:String):String{
    var w=(fact)
    return w

}

