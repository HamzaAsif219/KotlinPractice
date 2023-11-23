
enum class Day(val number : Int){
    Sunday(1),
    Monday(2),
    Tuesday(3),
    Wednesday(4),
    Thursday(5),
    Friday(6),
    Saturday(7);
    fun printformatedDay(){
        println("Day is $this")
    }
}
fun main(){

    var day=Day.Monday
    println(day.ordinal)
    println(day.number)

day.printformatedDay()
    for (i in Day.values())
        println("$i : is "+i.number+"th day")

}



/*
fun CallNetwork.networkfeedback(a:Int):Any{ //create extension of class CallNetwork and enum class NetworkResult
    return "${CallAPI(a).printResult()}"
}
class CallNetwork{
    fun CallAPI(statuscode:Int):NetworkResult{
        when(statuscode){
            200-> return NetworkResult.RESULT_OK
            400->return NetworkResult.BAD_REQUEST
            404->return NetworkResult.NOT_FOUND
            500->return NetworkResult.SERVER_ERROR
            else->return NetworkResult.UNKNOWN_ERROR
        }
    }
}
interface PrintResult{
    fun printResult()
}
enum class NetworkResult:PrintResult{
    RESULT_OK{
        override fun printResult() {
            println("API request is success")
        }
             },
    BAD_REQUEST {
        override fun printResult() {
println("calling request method is invalid")
        }
    },
    NOT_FOUND {
        override fun printResult() {
            println("calling request method is invalid")
        }
    },
    SERVER_ERROR {
        override fun printResult() {
            println("Oops, page or API request not found")
        }
    },
    UNKNOWN_ERROR {
        override fun printResult() {
            println("internal server error")
        }
    }
}


fun main(){

    var callnetwork=CallNetwork()
    println(callnetwork.CallAPI(200))

    callnetwork.networkfeedback(500)
}
*/
