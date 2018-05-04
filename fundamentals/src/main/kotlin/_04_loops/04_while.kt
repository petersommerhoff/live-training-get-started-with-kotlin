package _04_loops

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val COMMAND_MARCO = "m"
  val COMMAND_POLO = "p"

  // 1) Use while if #iterations is not known in advance (works same way as in Java/C# etc)

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