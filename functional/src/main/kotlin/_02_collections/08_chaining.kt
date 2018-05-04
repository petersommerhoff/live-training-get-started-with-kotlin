package _02_collections

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val users = listOf(
      User("johnnyboy", 17, false),
      User("susy", 35, true),
      User("katyyy", 42, true),
      User("gunther", 70, true)
  )

  // (1) Chaining higher-order functions
  val payingAndAdult = users.filter { it.paid }
      .filter { it.age >= 18 }
      .take(2)
      .map { it.username }
      .sorted()

  println(payingAndAdult)
}