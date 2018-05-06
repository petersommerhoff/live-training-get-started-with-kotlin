package _04_loops

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val COMMAND_MARCO = "m"
  val COMMAND_POLO = "p"

  // 1) Use while-loop if #iterations is not known in advance
  // Note: works same way as in Java, C#, ...
  var command = ""
  while (command.toLowerCase() != "q") {
    print("> ")
    command = readLine().toString().toLowerCase()  // Note: toString() necessary because nameOrNull (later)

    val output = when (command) {
      COMMAND_MARCO -> "MARCO!"
      COMMAND_POLO -> "POLO!"
      else -> ""
    }

    if (output != "") {  // Note: == checks structural equivalence, like equals() in Java
      println(output)
    }
  }
}

// Exercise: write a number guessing game where the user guesses numbers via the console (3-5 min)
// - type "main" then Tab to create a main function
// - use Random().nextInt(100) + 1 to generate a number in 1..100
// - use readLine() to read input
// - use an appropriate loop to continue until correct number is guessed
// - give the user a hint after every iteration (lower or higher)