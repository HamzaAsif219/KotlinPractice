
/*fun main(){
    var number:Int?=12
    println(number)
    number=null
    println(number)
}*/
/*fun main(){
    // TODO: this is safe call operator nullable values
    var name:String?="null"
    println(name?.toUpperCase())
}*/

/*fun main(){
    // TODO: without safe call operator using if condition for null values
    var name: String?=null
    if (name!=null){
        println("length of name is ${name.length}")
    }else{

        println("You didn't input any name")
    }

}*/
/*fun main(){
    // TODO: elvis operator
    var gender:String?=null
    var selectedValue:String?=gender?:"NA"
    println(selectedValue)
}*/
/*fun main(){
    // TODO: Elvis operator ?: using let function
    var gender:String?="null"
    var selectedValue:String?=gender?:"NA"
    gender?.let { println("line one")
    println("line two")
    }
    println(selectedValue)
}*/
/*fun main(){
    // TODO: not nullable !! operator
    var str : String?="null"
    var value:String=str!!.toUpperCase()
    println(value)
}*/
/*fun main(){
    // TODO: when and if
var a=10
var b=5
when(a>b){
    5->println("5")
    10-> println("10")
    else-> println("enter valid input")
}
}*/
/*fun main(){
// TODO: null check with if else

    var name =null
   if (name!=null){
       println(name)
   }else
       println("please enter a name")
}*/
/*fun main(){
    // TODO: null check with let
    var name= null
    name?.let{
        println(name)

    }
}*/