/*data class Equity(var name :String, var age:Int){
}

fun main(){

    var equ=Equity("Hamza", 25)
    var equ1=Equity("hamza",25)
    var equ2=equ1 // reference variable of same object
    println(equ2)
    println(equ2==equ1)
    println(equ)
    var a=2
    var b=34
    var result = a+b
    println(result)
}

 */

fun main(){
    var a=10
    var b=10
    var c=20
    println(a==b)// ture because a.equals(b)

    println(a===b) //ture because a and b reference variable are same objects
    println(a==c) // false because a.equals(c) are not equal
}