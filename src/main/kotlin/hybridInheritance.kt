open class ParentA{
    fun parentA(){
        println("ParentA ")

    }
}
class ChildA:ParentA(){
    fun childA(){
        println("Child A")
    }
}
open class Daughter:ParentA(){
    fun daughter(){
        println("Daughter")
    }
}
class Single:Daughter(){
    fun single(){
        println("Single")
    }
}
fun main(){
    val single=Single()
    val daughter=Daughter()
    daughter.daughter()
    daughter.parentA()
    single.single()
    
}