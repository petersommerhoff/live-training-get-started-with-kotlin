package _03_conditionals

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val price = 19.99

  // Arbitrary boolean expressions on LHS, also && and || for instance
  when {
    price < 10.0 -> println("Must be Black Friday")
    price == 14.99 -> println("Yearly summer sale")
    price < 20 -> println("Good offer")
    price > 50 -> println("Rip-off")
    else -> println("Normal price")
  }
}