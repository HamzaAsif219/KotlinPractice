/*fun interface AA{
    fun doSomethingElse()
    // var a // functional interface can not have abstract properties
    // fun doMore()// can not have more abstract method
    fun More(){
        println("AA class More function")
    }

}
fun interface intPredicate{
    fun check(i:Int):Boolean
}
fun test(a:Int, predicate: intPredicate){
    if (predicate.check(a)){
        println("valid")
    }else{
        println("invalid")
    }
}
fun main(){
    // without SAM conversion
    test(11, object:intPredicate{
        override fun check(i: Int): Boolean {
            return i%2==0
        }
    })
// with SAM conversion
    test(4,{i->i%2==0})

    test(-3, { i -> i>0 })
}

*/


/*fun interface intpredicate{
    fun check1(i:Int):Boolean
}
fun test(a:Int,pred:intpredicate){
    if (pred.check1(a)){
        println("Valid")
    }else{
        println("invalid")
    }
}
fun main(){

    //without SAM conversion
   test(3, object :intpredicate{
       override fun check1(v: Int): Boolean {
           return v%2==0
       }
   })

    //with SAM conversion
    test(4,{i->i%2==0})

}


 */

fun interface sum{
    fun add(a:Int,b:Int):Int
}
fun calculate(c: Int,d: Int, plus: sum){
 if (c>d){
     println("$c is greater than $d")
     println("The sum of $c and $d is: ${plus.add(c,d)}")
 }
 else{
        println("$c is less than $d")
        println("The sum of $c and $d is: ${plus.add(c,d)}")
    }
}

fun  main(){
    calculate(3,4,{a:Int,b:Int->a+b})

}