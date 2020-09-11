package machine

import java.util.*

var waterAvailable = 400
var milkAvailable = 540
var beansAvailable = 120
var cupsAvailable = 9
var moneyAvailable = 550
val scanner = Scanner(System.`in`)

fun main() {

    availableContents()

    println("Write action (buy, fill, take): ")

    when (scanner.next()) {
        "buy" -> actionBuy()
        "fill" -> actionFill()
        "take" -> actionTake()
        else -> println("Unknown Operation")
    }
}

fun actionTake() {

    println("I gave you $$moneyAvailable")
    moneyAvailable -= moneyAvailable
    availableContents()
}

fun actionFill() {
    println("Write how many ml of water do you want to add: ")
    waterAvailable += scanner.nextInt()

    println("write how many ml of milk do you want to add: ")
    milkAvailable += scanner.nextInt()

    println("Write how many grams of coffee beans do you want to add: ")
    beansAvailable += scanner.nextInt()

    println("Write how many disposable cups of coffee do you want to add: ")
    cupsAvailable += scanner.nextInt()

    availableContents()
}

private fun availableContents() {
    println("The coffee machine has: ")
    println("$waterAvailable ml of water")
    println("$milkAvailable ml of milk")
    println("$beansAvailable g of coffee beans")
    println("$cupsAvailable of disposable cups")
    println("$moneyAvailable of money")
}

fun actionBuy() {

    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ")

    when (scanner.nextInt()) {
        1 -> buyEspresso()
        2 -> buyLatte()
        3 -> buyCappuccino()
    }
}

fun buyCappuccino() {

    if (waterAvailable > 200 && beansAvailable > 12 && milkAvailable > 100 && cupsAvailable > 1) {
        waterAvailable -= 200
        beansAvailable -= 12
        milkAvailable -= 100
        moneyAvailable += 6
        cupsAvailable -= 1
        availableContents()
    }

}

fun buyLatte() {

    if (waterAvailable > 350 && beansAvailable > 20 && milkAvailable > 75 && cupsAvailable > 1) {
        waterAvailable -= 350
        beansAvailable -= 20
        milkAvailable -= 75
        moneyAvailable += 7
        cupsAvailable -= 1
        availableContents()
    }

}

fun buyEspresso() {

    if (waterAvailable > 250 && beansAvailable > 16 && cupsAvailable > 1) {
        waterAvailable -= 250
        beansAvailable -= 16
        moneyAvailable += 4
        cupsAvailable -= 1
        availableContents()
    }
}
