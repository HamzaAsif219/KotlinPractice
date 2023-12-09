class Automobile(name:String,val tyre:Int, val maxSeats:Int,val engineType:String){
//    init {
//        println("$name is created")
//    }
//    init {
//        println("2nd initializer block")
//    }


    constructor(name1:String,engineType1: String,modelYear:Int) : this(name1,4,5,engineType1)

    constructor(n: String,a:Int) : this(n,a,9,"Petrol")
    constructor(name2:String,ownerName:String):this(name2,4,5,"petrol")
    constructor(name3:String,engineType2: String, ownerName2:String):this(name3,4,7,engineType2)

}

fun main(){
    val automobile = Automobile("honda","petrol","Ali")
    println(automobile.maxSeats)
    val sutomobile2=Automobile("ahmed","Hamza")
    println(sutomobile2.engineType)
}