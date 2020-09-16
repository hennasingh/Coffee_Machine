import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    // put your code here

    var number = scanner.nextInt()
    var count = 1

    while (number > 0) {

        repeat(count) {
            if (number == 0) return
            print("$count ")
            number--

        }
        count++
    }
}