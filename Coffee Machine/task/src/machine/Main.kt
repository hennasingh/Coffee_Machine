package machine

import java.util.*

fun main() {
    println("Starting to make a coffee")
    println("Grinding coffee beans")
    println("Boiling water")
    println("Mixing boiled water with crushed coffee beans")
    println("Pouring coffee into the cup")
    println("Pouring some milk into the cup")
    println("Coffee is ready!")

    println("Write how many cups of coffee you will need: ")

    val scanner = Scanner(System.`in`)

    println("Write how many ml of water the coffee machine has: ")
    val waterAvailable = scanner.nextInt()

    println("Write how many ml of milk the coffee machine has: ")
    val milkAvailable = scanner.nextInt()

    println("Write how many grams of coffee beans the coffee machine has: ")
    val coffeeBeansAvailable = scanner.nextInt()

    val coffeeCupsPossible = minOf(waterAvailable/200 , milkAvailable/50, coffeeBeansAvailable/15)

    println("Write how many cups of coffee you will need: ")
    val coffeeCupsNeeded = scanner.nextInt()

    when {
        coffeeCupsNeeded == coffeeCupsPossible -> {
            println("Yes, I can make that amount of coffee")
        }
        coffeeCupsNeeded < coffeeCupsPossible -> {
            println(" Yes, I can make that amount of coffee ( and even ${coffeeCupsPossible - coffeeCupsNeeded} more than that")
        }
        else -> {
            println("No, I can make only $coffeeCupsPossible cups of coffee")
        }
    }



}
