import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    val first = scanner.next()
    val operator = scanner.next()
    val second = scanner.next()

    when(operator){
        "equals" -> println(first == second)
        "plus" -> println(first + second)
        "endsWith" -> println(first.endsWith(second))
        else -> println("Unknown operation")
    }
}