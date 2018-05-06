package _07_checks

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val authors = setOf("Shakespeare", "Hemingway", "Twain")
  val writers = setOf("Twain", "Shakespeare", "Hemingway")

  // (1) Structural equality: uses equals()
  println(authors == writers)  // Note: evaluates to false for lists instead of sets

  // (2) Referential equality
  println(authors === writers)
}