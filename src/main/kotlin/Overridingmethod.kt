open class Teacher {
    open fun teach() {
        println("teaching")
    }
    fun school(){
        println("School")
    }
}
    class MathTeacher:Teacher(){
        override fun teach() {
            println("Teaching Math")
        }

}
class Department:Teacher(){
    override fun teach() {
        println("Math's Department ")
    }

}
fun main(){
    var teacher=Teacher()
    var mathteacher=MathTeacher()
    teacher.teach()
    mathteacher.teach()
    mathteacher.school()

}