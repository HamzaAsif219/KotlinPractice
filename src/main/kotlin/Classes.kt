fun main(){

    val carolla=Car("CarollaX",4, "Petrol", 30)
    val honda=Car("city",4,"Petrol", 25)
    carolla.InnerNestedclass().printname()
 val nested=Car.nestedClass()// we can also use for direct // val nested=Car.nestedClass().printname()
val prsn1=Person("h",25)
    println(carolla.name)
    println(carolla.type)
    println(carolla.Km)
    println(honda.name)
    println(honda.type)
    println(honda.Km)
    honda.brakeApply()
    carolla.driveCar()
    println("Nested class: ${nested.printname()}")
    println("Nested another method : "+Car.nestedClass().printname())
    println("Inner Nested Class: "+ carolla.InnerNestedclass().printname())
    println(carolla.name3)


    println("Person Class ")
    println("$prsn1")
    println("Age"+prsn1.age1)
    println("Name :"+prsn1.name1)
}

class Car(val name:Any,val tyers:Int , val type:Any, val Km:Int)//properties
{ // TODO: Parent Class
    init {
        println("$name is created")
        println("typer is : $type ")
    }
    constructor(name: String, type: Any, Km: Int):this(name,5,type,Km)
   private val name1:String="Call me"

    private val name2:String="Private member"
    val name3:String="Public member"

    fun driveCar(){
        println(" $name Car is driving")
    }
    fun brakeApply(){
        println("$name Applied brake")
    }
    class nestedClass{ // TODO: Nested Class/ Child Class
        fun printname():String{
            return "Hello Nested class"

        }

    }
  inner class InnerNestedclass{ // TODO: Inner Nested Class
       private val b:String="Hello inner private variable"
       fun printname():String{
           val a:String="hello innerNested class body"
           println(a)
           return name2
       }

    }
}
class Person(name:String, age:Int){
    var name1=name
    var age1=age
}