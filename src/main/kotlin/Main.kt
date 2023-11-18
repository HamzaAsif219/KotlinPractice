/*fun main(){
    var a=4
    println("this is value of a: $a")
    a=7
    print("the new value of a: $a")

}*/
fun reverseString(str:String):Any{
    // TODO: Reverse Program for String and Integer
    var newString=""
    for(i in str.length-1 downTo 0){
        newString+=str[i]


    }
    return newString
}
fun main(){
    val reverse=reverseString("123456")
    println(reverse)
}
