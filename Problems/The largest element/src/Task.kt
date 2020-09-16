
import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here
    var max = 0

    do {
        val number = scanner.nextInt()
        max = maxOf(max, number)
    } while (number != 0)

    println(max)
}