
fun main(){

    var ob1=intContainer(2)
    var ob2=stringContainer("Hello")
    println(ob1.getValue())
    val cnt=Container(1)
    val cont=Container("hello")
    val conta=Container('M')

    println("Integer value "+cnt.getValue())
    println("String "+cont.getValue())
    println("Character ${conta.getValue()}")

   add(1,2,3,4,5,2)
    add(1,1,1,1,1)
    println(subt("Hell"))


}

fun <B> subt(valuee:B):B{
    return valuee


}
fun add(vararg value:Int){
    var sum=0
    for (i in value){
        sum+=i
    }
    println(sum)
}

class Container<A>(var data:A){
    // TODO: generics
    fun setValue(value: A){
        data=value
    }
    fun getValue():A{
        return data

    }
}

class intContainer(var data:Int){
    fun setValue(value: Int){
        data=value
    }
    fun getValue():Int{
        return data

    }
}

class stringContainer(var data:String){
    fun setValue(value: String){
        data=value
    }
    fun getValue():String{
        return data
    }
}