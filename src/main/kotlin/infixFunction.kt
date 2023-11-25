fun main(){
    var a=true
    var b=false
    var result:Boolean

   // result=a||b //method regular for beginners
    // result= a.or(b)// result is also same but its some complicated to understand
    result=a or b //Standard library using infix function its more readable
    println("the result is $result")



   var ad=20.add(30)  // extension

    println(ad)

    var subtract=23.Subtract(12).Subtract(3) //calling extension but this is infix notation
    println(subtract)



    var subtract1=23 Subtract 12 Subtract 4// using infix notation function
    println(subtract1)

    var equalto= 20 Equalto 20 // equalto using infix notation function
    println(equalto)
}

fun Int.add(b:Int):Int=this+ b //extension

infix fun Int.Subtract(b:Int):Int=this-b// infix function

infix fun Int.Equalto(b:Int):Boolean= this==b // infix function