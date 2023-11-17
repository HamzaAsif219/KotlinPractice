open class OverrideParent{
    // TODO: properties overriding
    open val a:Int=0 //properties
    val b:String="Hello Parent Class"
}
class OverrideChild:OverrideParent(){
    override val a:Int=10
    // var b:String="String"
}
class OverrideDaugther:OverrideParent(){
    override val a: Int=8
}
fun main(){
    val parentoverride=OverrideParent()
    val childoverride=OverrideChild()
    val overridedaugther=OverrideDaugther()
    println("Child class "+childoverride.a)
    println("Daughter class ${overridedaugther.a}")
    println("${parentoverride.b}")
}