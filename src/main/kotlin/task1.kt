/*fun main(){
    // TODO: fibonacci series
    var num1=0
    var num2=1
    var lmt=5

    for (i in num1..lmt){
        var num=num1+num2
        num1=num2
        num2=num
        println("$num1")

    }

}*/
/*fun main(){
    // TODO: fectorial
    var a=1

    for (i in 5 downTo 1){
       a=a*i

    }
    println(a)
    }*/
/*fun main(){
    // TODO: reverse string
    var str="abcd"
    var result=str.reversed()
    println(result)


}*/

/*fun main(){
    // TODO: reverse integer
    var intnum=12344
    var result =intnum.toString()
    var reverse=result.reversed()
    println(reverse)
}*/

 /*fun main(){

     // TODO: Prime number
     for (i in 2..30){
         var a=true
         if (i==1){
             println("Please start range from : 2")
             break
         }
         for (j in 2 until i){
             if(i%j==0){
                 a=false
             }

         }
         if (a){
             println("prime number is :$i")
         }
     }
 }*/

/*fun main(){
    // TODO: palindrome string using reversed()
    var str="W o w o w"
    var strInLowerCase=str.toLowerCase()
     var result=strInLowerCase.replace("\\s".toRegex(),"")
    var results=result.reversed()

    if (results==result){
        // println("this is result: $result ")
        println("this is palindrome: $str")
    }else{
       // println("this is result : $result")
        println("Given string is not palindrome : $str")
    }
}*/


/*fun main(){
    // TODO: palindrome Integer using reversed()
    var intnum=1121

    var convertinstring:String=intnum.toString()
    var results=convertinstring.reversed()
    if (results==convertinstring){
        println("Orignal integer : $intnum")
        println("this is palindrome string: $results")
    }else{
        println("Orignal integer: $intnum")
        println("Given integer result is not palindrome: $results")
    }
}*/

/*fun main(){
    // TODO: Union of sets
    var set1= listOf(1,2,3,4,5,6)
    var set2= listOf(5,6,7,8,9)
    var result=set1 union set2
    println("Union of sets is: "+result)
}*/
/*fun main(){
    // TODO: Intersact of sets
    var set1= listOf(1,2,3,4,5,6)
    var set2= listOf(5,6,7,8,9)
    var result=set1 intersect set2
    println("Intersact of sets: $result")
}*/
/*fun main(){
    // TODO: Subtract of sets
    var set1= listOf(1,2,3,4,5,6)
    var set2= listOf(5,6,7,8,9)
    var result=set1 subtract set2
    println("Subtract of sets: $result")
}*/

/*
// TODO: Menu of given task using when
fun palint()
    {
        // TODO: palindrome Integer using reversed()
        var intnum=1121

        var convertinstring:String=intnum.toString()
        var results=convertinstring.reversed()
        if (results==convertinstring){
            println("Orignal integer : $intnum")
            println("this is palindrome string: $results")
        }else{
            println("Orignal integer: $intnum")
            println("Given integer result is not palindrome: $results")
        }
    }

fun union(){
    // TODO: Union of sets
    var set1= listOf(1,2,3,4,5,6)
    var set2= listOf(5,6,7,8,9)
    var result=set1 union set2
    println("Union of sets is: "+result)
}
fun intersact(){

        // TODO: Intersact of sets
        var set1= listOf(1,2,3,4,5,6)
        var set2= listOf(5,6,7,8,9)
        var result=set1 intersect set2
        println("Intersact of sets: $result")

}
fun subtractSet(){
    // TODO: Subtract of sets
    var set1= listOf(1,2,3,4,5,6)
    var set2= listOf(5,6,7,8,9)
    var result=set1 subtract set2
    println("Subtract of sets: $result")
}
fun main(){
    println("1. Fibonacci Series of given number")
    println("2. fictorial of number")
    println("3. Plandrome of integer or string")
    println("4. Prime number")
    println("5. Reverse of string")
    println("6. Union, Intersact, Subtract")
    println("---> Please select number<---")
    var input= readLine()?.toInt()
    when(input){
        3-> {
            println("Palandrome of integer")
            palint()
        }
        6-> {
            println("Union sets")
            union()
            println("Intersact of set")
            intersact()
            println("Subtract of set")
            subtractSet()}
    }
}
}*/
/*fun main(){
    // TODO: remove spaces
    var str="w  e e t    yi"
    var result=str.replace("\\s+".toRegex()," ")
    println(result)
}*/