open class Teacher {
    open fun teach() {
        println("PARENT teaching")
    }
    fun school(){
        println("TEACHER CLASS PARENT School")
    }
}
     class MathTeacher:Teacher(){
        override fun teach() {
            println("MATHTEACHER CHILD CLASS Teaching Math")
        }

}
class Department:Teacher(){
    override fun teach() {
        println("DEPARTMENT CHILD CLASS Math's Department ")
    }

}
fun main(){
    var teacher=Teacher()
    var mathteacher=MathTeacher()
    teacher.teach()
    mathteacher.teach()
    mathteacher.school()
    teacher.teach()

}