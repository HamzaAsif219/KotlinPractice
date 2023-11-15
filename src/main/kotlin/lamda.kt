fun main(){
//println(sum(2.0,6.0))
//    println(power(3.0,7.0))
//    var fn:(a:Double,b:Double)->Double=::sum
//    println(fn(2.0,4.0 ))
    calculator(3.2,5.6,::sum )
    var Lambda={a:Int,b:Int-> a+b} //lambda expression
    println(Lambda(22,4))

var lambda:(Int, Int)->Int ={a,b-> a+b}// lambda expression
println(anonymous(45.5,5.7))// anonymous function
}


var anonymous=fun(x:Double,y:Double):Double{
    return x+y
}//Anonymous function
fun sum(a:Double,b:Double):Double{
    return a+b
}
fun calculator(a:Double,b:Double, gn:(Double,Double)->Double){
    val result:Double=gn(a,b)
println(result)
}
fun power(a:Double,b:Double):Double{return a+b}
fun hello(a:Int):Unit{

}