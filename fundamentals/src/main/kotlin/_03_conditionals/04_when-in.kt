package _03_conditionals

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val age = 19

  when (age) {
    in 0..17 -> println("You're not allowed to")
    in 18..20 -> println("You may be allowed to")
    in 21..150 -> println("Do as you please")
    else -> println("That's not a valid age")
  }

  // Sidenote: a..b are ranges
  val range: IntRange = 1..10
  println(range)
  println(range.toList())
}