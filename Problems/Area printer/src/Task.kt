class Rectangle(val width: Int, val height: Int)

fun printArea(rectangle: Rectangle) {

    val area = rectangle.width * rectangle.height
    println(area)
}