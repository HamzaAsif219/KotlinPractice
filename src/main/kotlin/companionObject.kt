
fun main(){
    println("1st Number is ${Summ.no1}")
    println("2nd Number is"+Summ.no2)
    Summ.addd()

    //Summ.display()// not access without creating class object

    val clsSumm=Summ()
    clsSumm.display()

}
class Summ{
    var name="Kotlin"
    companion object{
        var no1=1
        var no2=24
        fun addd(){
            println("Sum of $no1 and $no2 is : ${no1+ no2}")
        }

    }
    fun display(){
        println("My name is $name")
    }

}