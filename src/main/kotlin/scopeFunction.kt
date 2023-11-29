/*class Human{
    fun name(name:String){
        println("My name is : $name")
    }
    fun age(age:Int){
        println("My age is : $age")
    }
}

fun main(){
    var h=Human()
    h.name("Hamza")
    h.age(25)

    Human().let {
        it.name("Hamza : letfunction")
        it.age(25)
    }
    Human().run {
        this.name("Hamza : runfunction")
        this.age(25)
    }
    with(Human()) {
        this.name("Hamza: withfunction")
        this.age(25)

    }
    Human().apply {
        this.name("Hamza : applyfunction")
        this.age(25)
    }
    Human().also {
        it.name("Hamza : alsoFunction")
        it.age(25)
    }

}


 */

/*
class Human(){
    fun name(name:String){
        println("Name : $name")
    }
    fun age(age:Int){
        println("Age: $age")
    }
}
fun main(){
    Human().let{
        it.age(25)
        it.name("let function: Hamza")
    }
    Human().run { age(24)
    name("run function: Hamza")
    }
    Human().apply { age(25)
    name("apply function: Hamza ")

    }
    with(Human()) {
        age(25)
        name("Hamza")
    }
    Human().also { it.age(25)
    it.name("also function: hamza")}
}

*/
/*
fun main(){
    Student11().name?.let{

        println( "Name is $it")
    }
    Student11().apply {

        this.name="yeah"
        println(name)

    }

    Student11().also {
        it.name="alsofunction"
        println(it.name)
    }
//println(stud)
}
class Student11{
    var name:String?="hello"
}
*/

fun main(){
    var emp=Employee()
    emp.age=24
    emp.name="hello"

    emp.apply {
        age=25
        name="Hamza"
    }
    emp.also {
        it.age=22
        it.name="hye"
    }
    emp.let {
        it.name="letFunction"
        it.age=21
    }
    println(emp)
}
data class Employee(var name:String="",var age:Int=18)