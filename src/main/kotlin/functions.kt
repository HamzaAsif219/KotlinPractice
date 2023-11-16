/*fun main(){
    // TODO: built-in function Math.sqrt()
    var a=16.0
    println(Math.sqrt(a))
}*/

fun task(){
    // TODO: No argument and no return type function
    var a=12
    var b=23
    var c=a+b
    println(c)
}
fun task1():Int{
    // TODO: No argument and return type
    var a=12
    var b=23
    var c=a+b
    return c

}
fun task2(a:Int, b:Int){
    // TODO: argument and no return type
var c=a+b
    println("sum of a and b: $c")
}
fun task3(a:Int,b:Double):Double{
    // TODO: function with argument and return type
    var c=a+b
    return c
}

// TODO: recursive function
var count=0
fun recursive(){

    count++
    if (count<=10) {println("HELLO $count")
    recursive()
    }

}
fun fectorial(n:Int):Long{
    // TODO: fectorial using recursive function
    return if (n==1) n.toLong() else n*fectorial(n-1)
}
fun anonumous(a: Int,b: Int):Int{return a+b}



fun main(){
/*println("No argument and no return function")
    task()
    println("function with No argument and return type: ${task1()}")
    println("function with Argument and no return type: ")
    task2(22,3)
    println("function with argument and return type : ${task3(3, 5.4)}")

    */

   /* var number=5

    println("fectorial of $number is ${fectorial(number)}" )
    */
   // recursive()


    // TODO: Lamda function
    var lamba={a:Int,b:Int-> a+b}
    println(" Lamda : "+lamba(2,4))
    println("lamda is "+lamba(3,5))



   println("Anonumus function: ${anonumous(2,3)} and  Lamda is :"+ lamba(2,5))
}