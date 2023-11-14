fun main(){
println(sum(2.0,6.0))
    println(power(3.0,7.0))
    var fn:(a:Double,b:Double)->Double=::sum
    println(fn(2.0,4.0 ))
}
fun sum(a:Double,b:Double):Double{
    return a+b
}
//fun calculator(a:Double,b:Double)
fun power(a:Double,b:Double):Double{return a+b}
fun hello(a:Int):Unit{

}