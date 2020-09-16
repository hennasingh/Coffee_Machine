import java.util.*
import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    // write your code here
    var totalMoney = scanner.nextInt()

    while (scanner.hasNextInt()) {
        val number = scanner.nextInt()
        if (totalMoney >= number) {
            totalMoney -= number
        } else {
            return println("Error, insufficient funds for the purchase. You have $totalMoney, but you need $number.")
        }
    }
    println("Thank you for choosing us to manage your account! You have $totalMoney money.")
}