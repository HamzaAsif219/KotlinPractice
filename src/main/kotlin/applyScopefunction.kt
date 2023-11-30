/*
class Student1{

    var name: String = ""
    var age: Int = 0
    var grade: String = ""

    fun displayInfo() {
        println("Name: $name, Age: $age, Grade: $grade")
    }
}

fun main() {
    val student = Student1().apply {
        name = "Alice"
        age = 18
        grade = "A"
    }

    student.displayInfo()
}

 */
/*
// TODO: scope function using apply
data class Car1(var make: String, var model: String, var year: Int)

fun main() {
    val car = Car1("Toyota", "Camry", 2020)

    val configuredCar = car.apply {
        make = "Honda"
        model = "Accord"
        year = 2022
        //println("Configured car $this")
    }

    println("Original car: $car")
    println("Configured car: $configuredCar")
}

 */


/*
class CarBuilder {
    var make: String = ""
    var model: String = ""
    var year: Int = 0

    fun build(): Car1{
        return Car1(make, model, year)
    }
}

data class Car1(val make: String, val model: String, val year: Int)

fun main() {
    val car = CarBuilder().apply {
        make = "Tesla"
        model = "Model 3"
        year = 2022
    }.build()

    println("Built car: $car")
}

 */

