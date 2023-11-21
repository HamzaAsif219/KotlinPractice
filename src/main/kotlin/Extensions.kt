fun main(){
    var circle=Circle1(4)
    println(circle.perimeter())
    println(circle.area())
println("Jannat".findChar(4))
    var a=2
    println(a.IntegerStyle())

    println("Kotlin".firstandLastletter())
  /* println(ExtExample().printMyName())
    println("1000 ".priceFormat())

   */
  /*  //calculatetime { loop(1000800) }
    println("Hello World".StringStyle())
    var a=2
   // println(a.IntegerStyle())
        var d=3345
    var e=4455

    println(e.Multiply(d,e))
*/
}
class Circle1(var radius:Int){
    fun area():Double{
        return Math.PI*radius*radius
    }

}

fun Circle1.perimeter():Double{
    return 2*Math.PI*radius
}



fun String.findChar(index:Int):Char=this[index]




fun String.firstandLastletter():String{
    return "${this[0]} ${this[this.length-1]}"
}
fun String.StringStyle():Any{
    return "************\n$this\n************"
}
fun Int.IntegerStyle():Any{
    return "^^^^^^^\n$this\n^^^^^^^"

}

fun Int.Multiply(a:Int,b:Int):Int{
    return a*b
}



fun calculatetime(fn:()->Unit){
    val start=System.currentTimeMillis()
    fn()
    val end=System.currentTimeMillis()
    println("Time taken ${end-start}ms")
}
fun loop(n:Long){
for (i in 1..n){

}
}

