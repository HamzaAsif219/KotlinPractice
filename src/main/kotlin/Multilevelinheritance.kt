open class Parent{
    fun parentprop(){
        println("Parent properties")
    }
}
open class Child: Parent(){
    fun childprop(){
        println("Children Properties")
    }
}
class GrandChild:Child(){
    fun grandChild(){
        println("Grand Children Properties")
    }
}
fun main(){
    val grandchild=GrandChild()
    grandchild.parentprop()
    grandchild.childprop()
    grandchild.grandChild()
}