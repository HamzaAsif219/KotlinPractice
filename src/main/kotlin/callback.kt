/*

// Function that takes a callback as a parameter

fun performTask(callback: ()->Unit) {
    // Simulate some task
    println("Task completed successfully!")

    // Invoke the callback
    callback()
}

fun main() {
    // Call the function with a callback
    performTask {
        // Callback implementation
        println("Callback: Task is done!")
    }
}

 */
fun performOperation(operation:(Int,Int)->Int,a:Int,b:Int):Int{
    return operation(a,b)
}
fun  additon(a:Int,b:Int):Int{
    return a+b
}
fun subtract(a:Int,b:Int):Int{
    return a-b
}
fun main(){
    var add=performOperation(::additon,3,5)
    println("Sum of two values: "+add)
    var subt=performOperation(::subtract,9,5)
    println("Subtract of two values :"+subt)
}