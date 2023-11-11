fun main(){
    var num1=0
    var num2=1
    var lmt=5

    for (i in num1..lmt){
        var num=num1+num2
        num1=num2
        num2=num
        println("$num1")

    }

}