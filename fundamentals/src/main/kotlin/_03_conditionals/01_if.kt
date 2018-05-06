package _03_conditionals

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val age = 13

  // (1) Simple if-statement
  if (age < 18) {
    println("You're too young for fun stuff")
  }

  // (2) Condition operators && and || (use short-circuiting)
  if (args.size > 0 && args[0] == "greet") {
    println("Hello there!")
  }
}