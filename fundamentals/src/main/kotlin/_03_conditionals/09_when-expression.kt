package _03_conditionals

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val price = 9.99

  val sale: String = when {
    price < 10.0 -> "Black Friday Sale"
    price == 14.99 -> "Yearly summer sale"
    price < 20 -> "Regular sale"
    else -> "No sale"  // Note: else-case required when using value
  }

  println("Come in! $sale taking place!")
}