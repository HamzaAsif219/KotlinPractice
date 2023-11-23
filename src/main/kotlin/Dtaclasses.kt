fun main(){
    val p1=Person11(2,"Ali")
    val p2=Person11(2,"Ali")
//    println(p1)
//    println(p2)
//    println(p1==p2)
    val p3=p1.copy(id = 4)
    println(p3)

    println(p1.id)
    println(p1.name)
    println(p1.component2())
    println("Sum : "+ p1.addition(2,4))
}



data class Person11(var id:Int,var name:String){
    fun addition(a:Int,b:Int):Int{
        return a+b
    }

}



/*class Child1:Person11(3,"Ahmed"){

}
*/


/*
data class Persons(var name:String){
    var age:Int=0


}

fun main(){
    var p1=Persons("Hello")
    var p2=Persons("hello")
     p1.age=14
    p2.age=18
    println(p1)
    println(p1.age)
    println(p2)
    println(p2.age)
}
*/