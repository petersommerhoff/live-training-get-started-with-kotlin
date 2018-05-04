package _06_nullhandling

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  var name = ""

  while (name == "") {
    println("What's your name?")
    print("> ")

    // (1) Elvis operator
    name = readLine() ?: ""
  }

  println("Welcome back $name!")
}