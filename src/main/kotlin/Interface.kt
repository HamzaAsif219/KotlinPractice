interface SuperClass{
    fun myDetails()
    fun myAge(age:Int):Int
    fun printName():String{
        return "Hamza"
    }
}
interface SueprClass2{
   // fun address() //absrtact method when can not call it in child class it will show compile time error because restricted to call in child class
// fun printName(){
//    println("override from Superclass2")
//}
    fun yourCountry(){ //concrete method not restrict to call in child class
        println("Pakistan")
    }
    fun yourCity(){
        println("Daska")
    }

}
class ChildClass:SuperClass,SueprClass2{
    override fun myAge(age: Int): Int {
        return age
    }

    override fun myDetails() {
        println("Department BSCS")

    }

    override fun yourCountry() {
        super.yourCountry()
        println("Hi, Child Class ")
    }


}
fun main(){
    val objInterface=ChildClass()
    println(objInterface.myAge(25))
    println(objInterface.printName())
    objInterface.myDetails()
    objInterface.yourCountry()
    println("Hello using extension".StringStyle())
}
