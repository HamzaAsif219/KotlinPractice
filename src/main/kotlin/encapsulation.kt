class Encapsulation{
    private var name:String= ""


    private var age:Int=0

    fun getName():String{
        return this.name

    }
    fun setName(name:String){
        this.name=name
       
    }
    fun getAge():Int{
       return  age

    }
    fun setAge(age:Int){
         this.age=age
    }
}


class calculator{
    var num=23
 var num2=34
    private var c=9
   protected fun add(){
       println("sum of numbers ${num + num2}")
    }
fun multiply(){
    println("Multiply ${num*num2}" )

}
    fun number(){
        println(c)
    }

}
fun main(){

   var cal=calculator()
   // cal.add() //showing error when protect this function because this will not access outside the class or subclass
    cal.multiply()
cal.number()


/*
    var obj=Encapsulation()
    obj.setAge(25)
    obj.setName("waqas")
    println(obj.getAge())
    println(obj.getName())


 */

}
