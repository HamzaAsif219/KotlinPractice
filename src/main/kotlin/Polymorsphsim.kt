/*
fun main(){
    // TODO: polymorphism in functions
    result("Hamza")
    result(2.68)
    result(2,5)
}

fun result(name:String){
    println(name)

}
fun result(n1:Int,n2:Int) {
    println(n1+n2)
}
fun result(num:Double){
    println(num)
}
*/
fun main(){

// TODO: polymorphism using classes

//    val circle:Shape=Circle(4.0)
//    val square:Shape=Square(4.0)
//    println(circle.area())
//    println(square.area())

   println("calculate using polymorphism")
    val s=arrayOf(Circle(4.0),Square(5.0),Triangle(5.4,8.0))
caluculateArea(s)

}
fun caluculateArea(shapes:Array<Shape>){
    for (shape in shapes){
        println(shape.area())
    }

}
open class Shape{
    open fun area():Double{
        return 0.0
    }
}
class Circle(val radius: Double):Shape(){
    override fun area(): Double {
        super.area()
        return Math.PI*radius*radius
    }
}
class Square(val side : Double):Shape(){
    override fun area(): Double {
        return side*side
    }
}
class Triangle(val base:Double,val height:Double):Shape(){
    override fun area(): Double {
        return 0.5*base*height
    }
}




