package machine

import java.util.*

var waterAvailable = 400
var milkAvailable = 540
var beansAvailable = 120
var cupsAvailable = 9
var moneyAvailable = 550
var repeatAction = true
val scanner = Scanner(System.`in`)

fun main() {

    while (repeatAction) {
        writeAction()
    }
}

private fun writeAction() {

    println("Write action (buy, fill, take, remaining, exit): ")

    when (scanner.next()) {
        "buy" -> actionBuy()
        "fill" -> actionFill()
        "take" -> actionTake()
        "remaining" -> availableContents()
        "exit" -> repeatAction = false
        else -> println("Unknown Operation")
    }
}

fun actionTake() {

    println("I gave you $$moneyAvailable")
    moneyAvailable -= moneyAvailable
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

    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")

    when (scanner.next()) {
        "1" -> buyEspresso()
        "2" -> buyLatte()
        "3" -> buyCappuccino()
        "back" -> writeAction()
    }
}

fun buyCappuccino() {

    if (waterAvailable > 200) {
        if (beansAvailable > 12) {
            if (milkAvailable > 100) {
                if (cupsAvailable > 1) {
                    enoughResources()
                    waterAvailable -= 200
                    beansAvailable -= 12
                    milkAvailable -= 100
                    moneyAvailable += 6
                    cupsAvailable -= 1
                } else {
                    println("Sorry, not enough cups!")
                }
            } else {
                println("Sorry, not enough milk!")
            }
        } else {
            println("Sorry, not enough coffee beans!")
        }
    } else {
        println("Sorry, not enough water!")
    }
}

private fun enoughResources() {
    println("I have enough resources, making you a coffee!")
}

fun buyLatte() {

    if (waterAvailable > 350) {
        if (beansAvailable > 20) {
            if (milkAvailable > 75) {
                if (cupsAvailable > 1) {
                    enoughResources()
                    waterAvailable -= 350
                    beansAvailable -= 20
                    milkAvailable -= 75
                    moneyAvailable += 7
                    cupsAvailable -= 1
                } else {
                    println("Sorry, not enough cups!")
                }
            } else {
                println("Sorry, not enough milk!")
            }
        } else {
            println("Sorry, not enough coffee beans!")
        }
    } else {
        println("Sorry, not enough water!")
    }

}

fun buyEspresso() {

    if (waterAvailable > 250) {
        if (beansAvailable > 16) {
            if (cupsAvailable > 1) {
                enoughResources()
                waterAvailable -= 250
                beansAvailable -= 16
                moneyAvailable += 4
                cupsAvailable -= 1
            } else {
                println("Sorry, not enough cups!")
            }
        } else {
            println("Sorry, not enough coffee beans!")
        }
    } else {
        println("Sorry, not enough water!")
    }
}
