package _05_functions

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Extension function on Int
fun Int.times(str: String) = str.repeat(this)

// (2) Extension function on String
fun String.isPalindrome() = this.toLowerCase().let { it == it.reversed() }

// (3) Extension property (getters/setters discussed later)
// Note: must use getter because there's no backing field (we cannot actually modify the class)
val String.lastChar
  get() = this[length - 1]

// (4) Member functions take precedence
val String.length
  get() = -1

// (5) Resolved statically
fun Number.describe() {
  println("I'm one of the pillars of mathematics.")
}
fun Int.describe() {
  println("I can represent a restricted set of integer numbers.")
}

fun main(args: Array<String>) {

  // (6) Called like member methods
  val cry = 3.times("Woah ")
  println(cry)

  println("Kottok".isPalindrome())
  println("Linlin".isPalindrome())

  println("Kotlin".lastChar)

  // (4) Member takes precedence
  println("Android".length)

  // (5) Resolved statically
  val n: Number = 17  // Note: actually an Int at runtime
  n.describe()
}