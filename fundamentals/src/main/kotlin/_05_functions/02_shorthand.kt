package _05_functions

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Single-expression function shorthand
// Note: show equivalent non-shorthand
fun farewell(name: String) = "Bye bye $name!"

fun isPermitted(age: Int) = age >= 18

fun isEmpty(str: String, ignoreWhitespace: Boolean) =
    if (ignoreWhitespace) str.isBlank() else str.isEmpty()

fun main(args: Array<String>) {

  // (2) Called like any other function
  val farewell = farewell("Patrick")  // Sidenote: no name clash
  println(farewell)

  val reaction = if (isPermitted(15)) "Yay, I am in!" else "Need to wait a few more years..."
  println(reaction)

  println(isEmpty("   ", true))
}