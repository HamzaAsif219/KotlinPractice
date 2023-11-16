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
fun main(){
    var s1=Student()
    var c1=Student.Car()
    var d1=Student.Department()
    println(s1.name)
println("${c1.name} and "+c1.carname())

println(" this is car class"+c1.age)
println("this is student class ${s1.age}")
    println("Gender is ${c1.gender}")
    println("Department is ${d1.department()}")
}
