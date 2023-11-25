class Human{
    fun name(name:String){
        println("My name is : $name")
    }
    fun age(age:Int){
        println("My age is : $age")
    }
}

fun main(){
    var h=Human()
    h.name("Hamza")
    h.age(25)

    Human().let {
        it.name("Hamza : letfunction")
        it.age(25)
    }
    Human().run {
        this.name("Hamza : runfunction")
        this.age(25)
    }
    with(Human()) {
        this.name("Hamza: withfunction")
        this.age(25)

    }
    Human().apply {
        this.name("Hamza : applyfunction")
        this.age(25)
    }
    Human().also {
        it.name("Hamza : alsoFunction")
        it.age(25)
    }
    
}