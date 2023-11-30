
/*
// TODO: Scope function using with
class Person2{
    var name:String="Hello "
    var age : Int=23


}
class Person3{
    var name:String?=null
    var age:Int?=null
}
fun main(){
    var person2=Person2()
    println(person2.name)
    println(person2.age)
    var ageAfterFiveyear:Int=with(Person2()) {
        println(this.name)
        this.age=35 //reassign the value
        println(age)
        age+5 //lambda expression return Int
    }
    println("Age after five years : $ageAfterFiveyear")

    //var person3=Person2()
    var bio:String= with(Person2()){
        println(name)
        println(age)
        "Hello using with return lambd expression"// lambda expression return string
    }
    println(bio)

    //var person3=Person3()
    var nullvalues:String=with(Person3()) {
        println(this.age)
        println(name)
        "hello null values using with"
    }
    println(nullvalues)
}

*/
/*
class Person2{
    // TODO: scope function using apply
    var name:String=""
    var age:Int=0
}
class Person3{
    var name:String?=null
    var age:Int?=null
}
fun main(){

    //var Stringapplu:String=
       var person2= Person2().apply {
        name= "Hello apply"
            println(name)
            name="helllo apply 2"
    println(name)
        age=23
           println(age)
       // "hello " it will not return lambda result for int or string

    }
    with(person2) {
        println(name)
        println(age)
    }
person2.also {
    it.name="hello from it"
    println("new string is : ${it.name}")
}

    Person3().apply {

        println(name)
        println(age)
    }
}

 */
/*

class Person2{
    var name:String=""
    var age:Int=0

}
fun main(){
    var person2=Person2().apply {
        this.name="hello"
        //println(name)
        this.age=24
        //println(age)

    }
   var a= with(person2){
        name
        age
    }
    println(a)

}
*/

/*
class Person2{
    var name="hello also"
    var age=23
}
fun main(){
    var person2=Person2().also {
        it.name
        it.age=9
    }
    var a=with(person2){
        println(age)
        println(name)
        "asdf"
        "$age"

    }
println(a)
}

 */







