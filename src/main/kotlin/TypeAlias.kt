typealias User=Triple<String,String,Int>
typealias twoIntergers=Pair<Int,Int>

fun fetchUser():Triple<String,String,Int>{
    return Triple("Hamza ","Asif",25)
}
fun UserDetails():User{
    return User("Ali","Ahmed",23)
}
fun User1():User{
    return User("Hamza","Asif",25)
}
fun main(){

    println(fetchUser())
    println(UserDetails())
    println(User1())


}