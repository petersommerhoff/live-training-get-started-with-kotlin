package _07_checks

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val authors = setOf("Shakespeare", "Hemingway", "Twain")
  val writers = setOf("Twain", "Shakespeare", "Hemingway")

  // (1) Structural equality [equals()]
  println(authors == writers)  // Note: not equal with lists

  // (2) Referential equality
  println(authors === writers)
}