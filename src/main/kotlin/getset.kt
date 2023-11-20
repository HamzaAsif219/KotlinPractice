class Person1(nameParam:String, ageParam:Int){
    var name:String=nameParam
        get(){
            return field.toUpperCase()
        }
    var age:Int=ageParam
        set(value){
            if (value>0){
                field=value
            }else{
                println("age is negative")
            }

        }
}

fun  main(){
    val objPerson1=Person1("Hello ",23)
    objPerson1.age=-1
    objPerson1.age
    println(objPerson1.name)
}