package _03_conditionals

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val age = 13
  if (age < 18) {
    println("You're too young for fun stuff")
  }

  if (args.size > 0 && args[0] == "greet") {  // Similarly, || for "or"
    println("Hello there!")
  }
}