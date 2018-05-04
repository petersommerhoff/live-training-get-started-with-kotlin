package _03_conditionals

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // 1) There is no ternary operator (condition) ? a : b in Kotlin, have if-expression for that

  val username = "peter"
  val feedback = if (username.length < 6) "Please enter at least 6 characters" else "All good"

  println(feedback)
}