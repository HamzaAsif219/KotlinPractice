/*
data class Book(var title: String, var author: String, var pages: Int)

fun main() {
    val book = Book("Kotlin in Action", "Dmitry Jemerov", 400)

    val modifiedBook = book.also {
        it.pages += 50
        println("Additional action: Increased pages by 50 for $it")
    }

    println("Original book: $book")
    println("Modified book: $modifiedBook")
}

 */

/*
fun main() {
    val numbers = mutableListOf(1, 2, 3, 4)
    println(numbers)

    numbers.also {
        it.add(5)
        it.remove(2)
        println("Additional action: Modified numbers list: $it")
    }

    println("Original numbers list: $numbers")
}

 */
/*
fun main() {
    val greeting = "Hello, Kotlin!"

    val modifiedGreeting = greeting.also {
        println("Original Greeting: $it")
        println("Greeting Length: ${it.length}")
    }

    println("Modified Greeting: $modifiedGreeting")
}

 */
