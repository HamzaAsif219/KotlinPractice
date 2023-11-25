import kotlin.properties.Delegates

class ObservableExample{
    var l:Int by  Delegates.observable(0){ property, oldValue, newValue ->
        println("Old value $oldValue")
        println("New Value $newValue")
    }
}
fun main(){
    var e=ObservableExample()
    e.l =23
    e.l=30
}