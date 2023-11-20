fun main(){

var obj1=B()
    println(obj1.a)
    obj1.a=-1// a is public so everyone can change the value of this variable
    println(obj1.a)
    obj1.test()
    obj1.add()

}
open class  A{
    public var a=2 // anywhere
    private var b=3 //access just in same class
    protected var c=9 //access in same class or subclasses
    internal var d=4 //access in module
    fun add(){
        var e=3
        var f=9
    var result=e+f
        println(result)
        println(b)// private just access in the same class
    }
}
class B:A(){
    fun test(){

        println(a)
        //println(b)
        println(c)
        println(d)

    }

}