import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    // put your code here
    var color = input.next().trim()
    println(Rainbow.getColorOrder(color))

}

enum class Rainbow(val color: String) {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    GREEN("green"),
    BLUE("blue"),
    INDIGO("indigo"),
    VIOLET("violet");

    companion object {
        fun getColorOrder(value: String): Int {
            for (enum in Rainbow.values()) {
                if (value == enum.color) return enum.ordinal + 1
            }
            return 0
        }
    }
}