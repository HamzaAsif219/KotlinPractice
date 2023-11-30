

fun main(){
    var tile=Red("Mashroom", 25)
    var tile1=Red("fire",30)
      println("${tile.type} and ${tile.points}")
    // println(tile)
//    var points:Int=when(tile){
//        is Blue ->tile.points*4
//        is Red -> tile.points*2
//    }
//    println(points)



}
sealed class Tile
    class Red(val type:String,val points:Int):Tile()
    class Blue(val points: Int):Tile()





/*
fun main(){
var f1=Father.Child2()

var c1=Father.Child1
    c1.helloo()
    family(c1)

    var c2=Father.Child2()
    c2.bye()
    family(c2)
    c1.helooooo()

}

sealed class Father {
    fun helooooo(){
        println("Helloooooo Father class ")
    }

    data object Child1 : Father() {
        fun helloo() {
            println("Hello Child 1")
        }
    }
    class Child2 : Father(){
        fun bye(){
            println("Bye Child 2")
        }
    }
}

fun family(member:Father){
    when(member){
        is Father.Child1-> println("Child 1")
        is Father.Child2-> println("Child 2")
    }
}



 */