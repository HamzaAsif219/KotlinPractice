
fun main(){
    var p1=Point(10,30)
    var p2=Point(2,3)
    var p3=Point(2,3)
//     println(p1.add(p2))
   // println(p1.add(p1))
    println(p1 + p2 +p3)// plus
    println(p1-p2-p3)//minus
   // println(++p1)// increment
   // println(--p2)//decrement
    println(p1/p2)
    println(p1*p2)
    println(p2==p3)


}
data class Point(val x:Int, val y:Int){
    operator fun plus(point: Point):Point {
        return Point(this.x + point.x, this.y + point.y)

    }
    operator fun minus(point: Point):Point{
        return Point(this.x - point.x,this.y -point.y)
    }
    operator fun inc():Point{
        return Point(this.x+1,this.y+1)
    }
    operator fun dec():Point{
        return Point(this.x-1,this.y-1)
    }
    operator fun div(point: Point):Point{
        return Point(this.x/point.x,this.y/point.y)
    }
    operator fun times(point: Point):Point{
        return Point(this.x*point.x,this.y*point.y)
    }

//    fun add(point: Point):Point{
//        return Point(this.x+point.x,this.y+point.y)
//    }


}