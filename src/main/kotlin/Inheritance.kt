open  class Student{
    var name:String="Hamza"
    var age :Int=25
    var gender:String="Male"
    class Department:Student(){
        fun department():String{
            return "computer science"
        }

    }
    class Car:Student()
    {
        fun carname() : String{

           // println("Car name City")
            return "Car name City"
        }
    }

}

open class Phone{
    // TODO: herarical Inheritance classes
    
  val name:String="Nokia"
  val type:String="Android"
  val volume:Int=10
    fun makeCall(){"Make a Call"}
    fun display(){"this is display"}
    fun powerOff(){"power OFF"}
    fun getDeviceInfo(){"get device info"}


class BasicPhone : Phone() {

    fun getScreenInfo() {
        println("$name this is basicPhone getScreenInfo")

    }
}
    class SmartPhone:Phone(){



        fun playMovie(){"Volume to play movie is : $volume"}
        fun takePicture(){"Take a picture"}
        fun getLocation(){"Get location"}
    }
    class Notification:Phone(){
        fun getNotification(){"GEt notification"}
    }
}
fun main(){

/*
    // TODO: Herarical Inheritance
    val phone = Phone()
    val basicPhone = Phone.BasicPhone()
    val smarphone=Phone.SmartPhone()
    val notification=Phone.Notification()

    println("Phone type is: ${phone.type}")
    println("Phone Class :" + phone.name)

    print("BAsic Phone Class: Volume is ${basicPhone.volume} and ")
    basicPhone.getScreenInfo()
    print("SmartPhone Class :")
    smarphone.getLocation()
    print("Notification Class: ")
    notification.getNotification()
*/
    /*
    var s1=Student()
    // TODO: code for Student class with inheritance
    var c1=Student.Car()
    var d1=Student.Department()
    println(s1.name)
println("${c1.name} and "+c1.carname())

println(" this is car class"+c1.age)
println("this is student class ${s1.age}")
    println("Gender is ${c1.gender}")
    println("Department is ${d1.department()}")

     */
}
