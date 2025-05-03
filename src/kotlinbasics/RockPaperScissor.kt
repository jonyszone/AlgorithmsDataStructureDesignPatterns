package kotlinbasics

import java.util.*

fun main() {
    val options = arrayOf("Rock", "Paper", "Scissor")
   val gameChoice =  getGameChoice(options)
    val userChoice = getUserChoice(options)
    printResult(userChoice, gameChoice)
}

fun printResult(userChoice: String, gameChoice: String) {

    val result: String = if (userChoice == gameChoice) "Tie!"
    else if ((userChoice == "Rock" && gameChoice == "Scissor") ||
        (userChoice == "Paper" && gameChoice == "Rock") ||
        (userChoice == "Scissor" && gameChoice == "Paper")) "You win!"
    else "You lose!"
    println("Your chose $userChoice. I chose $gameChoice. $result")
}

fun getUserChoice(options: Array<String>): String {
    var isValidChoice = false
    var userChoice = ""
    while (!isValidChoice){
        print("Please enter choice: ")
        for (option in options)
            print(" $option")
            println(".")
        var userInput = readlnOrNull()

        if (userInput != null) { // userInput = userInput.lowercase().capitalize()
            userInput = userInput.lowercase().replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }
        }

        if (userInput !=null && userInput in options){
            isValidChoice = true
            userChoice = userInput
        }

        if (!isValidChoice) println("Enter valid choice.")
    }
    return  userChoice
}

fun getGameChoice(options: Array<String>) : String {
   return options [(Math.random() * options.size).toInt()]
}
