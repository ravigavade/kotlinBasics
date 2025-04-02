import java.awt.Rectangle
import kotlin.math.sqrt


fun main(){

    val rect1= Rectangle(2f,3f)
//    println(rect1.height)
    println(rect1)

    println("${rect1.diagonal}")
    println("${rect1.area}")
}

data class Rectangle(val width:Float, val height:Float){

    val diagonal= sqrt(width*width+height+height)

    val area=width*height

}