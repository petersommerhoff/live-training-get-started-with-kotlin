package lab

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val dinnerChoices = mutableSetOf("Stir Fry", "Pizza", "Pasta")
  val cmdDinner = "dinner?"
  val cmdAddChoice = "add"
  val cmdQuit = "quit"
  val validCommands = arrayOf(cmdDinner, cmdAddChoice, cmdQuit)

  // Local function, really only used here
  fun startAddChoiceDialog(dinnerChoices: MutableSet<String>) {
    println("Which choice do you want to add?")
    print("> ")
    val choice = readLine()!!
    if (choice.isNotBlank()) {
      dinnerChoices.add(choice.capitalize())
      println("Choice was added.")
    } else {
      println("No choice added. Back to main dialog...")
    }
  }

  // Main loop
  println("DINNER CHOICE MAKER 9000")
  do {
    print("> ")
    val input = readLine()!!.toLowerCase()  // Again, rare case where !! is okay

    when (input) {
      "dinner?" -> println(dinnerChoices.shuffled().first())
      "add" -> startAddChoiceDialog(dinnerChoices)
      else -> println("Please enter one of [${validCommands.joinToString()}]")
    }
  } while (input.toLowerCase() !in listOf("quit", "q"))
}