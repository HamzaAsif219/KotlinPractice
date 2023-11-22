import java.lang.Exception
import java.util.*

/*
fun main(){

    val scanner = Scanner(System.`in`)
    var arr= arrayOf(10,22,33,14,15)
    println("Enter index of array")
    var input=scanner.nextInt()

try {
    println("Input number is: $input")
    println("Index value is :"+arr[input])

}

catch (a:Exception){
    println("Please enter valid index")
}
    finally {
        println("result")
    }
}

 */
/*fun main(){
    val scanner=Scanner(System.`in`)
    try {
        print("Enter Your Age: ")
        val inputAge=scanner.nextInt()
        try {
            if (inputAge>18){
                println("you can drive")
            }
        }
        catch (e: InputMismatchException){
            println("Enter valid number")
        }
    }catch (e: Exception){
        println("Invalid number")
    }


}

 */
fun validate(age:Int){
    if(age<18){
        throw ArithmeticException("Under age")
    }else{
        println("eligible for drive")
    }
}

fun main(){
    var scanner=Scanner(System.`in`)
    print("Enter age: ")
    var input=scanner.nextInt()

    validate(input)


}