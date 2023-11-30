/*data class Person2(var name: String, var age: Int)

fun main() {
    val person = Person2("John", 30)

    val result = person.run {
        // Code to be executed on the person object
        println("Name: $name, Age: $age")

        // You can perform any operations here
        age += 5

        // The result of the lambda expression (last line) will be assigned to 'result'
        "Person's age after adding 5 years: $age"
    }

    println(result)
    println("Original person object: $person")
}

 */
/*
fun main() {
    val number = 10

    val result = run {
        val squared = number * number
        squared + 5 // The result of this expression will be the return value of 'run'
    }

    println(result) // Output: 105
}

 */

/*
data class Point1(var x: Int, var y: Int)

fun main() {
    val point = run {
        val initialX = 5
        val initialY = 8
        Point1(initialX, initialY) // The result of this expression will be the return value of 'run'
    }

    println(point) // Output: Point(x=5, y=8)
}
*/
fun main() {
    val person = run {
        // Code to be executed in the context of 'run'
        val name = "Alice"
        val age = 30
        "Name: $name, Age: $age" // The result of this expression will be the return value of 'run'
    }

    println(person) // Output: Name: Alice, Age: 30
}
