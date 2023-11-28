import kotlin.concurrent.thread

/*
class MyThread : Thread() {
    override fun run() {
      //  for (i in 1..5) {
            println("Thread is running: ")
            Thread.sleep(1000) // Simulate some work being done
       // }
    }
}

fun main() {
    // Creating and starting a thread
    val myThread = MyThread()
    myThread.start()

   //  Main thread continues its own work
    for (i in 1..5) {
        println("Main thread is running: $i")
        Thread.sleep(500) // Simulate some work being done
    }
}
*/


/*
import kotlin.concurrent.thread

fun main() {
    // Friend 1 makes coffee
    thread {
        makeCoffee()
    }

    // Friend 2 makes toast
    thread {
        makeToast()
    }

    // Main thread (you) can do other things while friends prepare breakfast
    for (i in 1..3) {
        println("Doing other things while waiting: $i")
        Thread.sleep(1000) // Simulate other activities
    }

    println("Main thread: Breakfast is ready!")
}

fun makeCoffee() {
    for (i in 1..5) {
        println("Friend 1: Making coffee step $i")
        Thread.sleep(500) // Simulate coffee-making steps
    }
    println("Friend 1: Coffee is ready!")
}

fun makeToast() {
    for (i in 1..3) {
        println("Friend 2: Toasting bread step $i")
        Thread.sleep(700) // Simulate toasting steps
    }
    println("Friend 2: Toast is ready!")
}
*/

/*
// TODO: Multithreading
fun makeCoffee(){
    for(i in 1..5) {
        println("Friend 1: Making coffee step: $i")
        Thread.sleep(500)
    }
    println("Friend 1: coffee is ready!")

}
fun makeToast(){
    for (i in 1..3) {
        println("Friend 2: Toast bread step: $i")
        Thread.sleep(700)
    }
    println("Friend 2: Toast is ready!")
}
 fun main(){
     thread {
         makeCoffee()
     }
     thread {
         makeToast()
     }
     for (i in 1..5){
         println("Doing other things while waiting: $i")
         Thread.sleep(1000)
     }
     println("Main thread: Breakfast is ready !")
 }
*/

// TODO: Single threading
fun makeCoffee(){
    for (i in 1..5){
        println("Coffee step: $i")
        Thread.sleep(500)
    }
    println("Coffee is ready !")
}
fun makeToast(){
    for (i in 1..3){
        println("Bread step: $i ")
        Thread.sleep(300)
    }
    println("Bread is ready!")
}
fun main(){
    thread {
        makeCoffee()
        makeToast()
        println("Yeah! Breakfast is ready !")
    }

}