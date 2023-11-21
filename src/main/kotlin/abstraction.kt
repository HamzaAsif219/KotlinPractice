abstract class A1{

   abstract fun hello()
   fun hello2(){
       println("Hello from hello 2 function")
   }

}
class B1:A1(){

    override fun hello() {
        println("Hello from B1 class")
    }
}

abstract  class abstract{
    abstract fun hye()
    abstract  fun bye()


    fun hello11(){
        println("Hello abstract class with no abstract method or property")
    }
}
class abstract2:abstract(){

    fun hello21(){
        hello11()
        println("Hello non abstract class with hello 21")
    }

    override fun bye() {
        println("Bye")
    }

    override fun hye() {
        println("Hye")
    }
}
fun  main(){


    var objB1class=B1()
    objB1class.hello()
    objB1class.hello2()
    var abs=abstract2()
    abs.hello11()// function of abstract class
    abs.hello21()// inherited with abstract class with non abstract properties
}