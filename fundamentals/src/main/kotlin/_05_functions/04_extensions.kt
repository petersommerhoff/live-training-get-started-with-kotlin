package _05_functions

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Extension function on Int
fun Int.times(str: String) = str.repeat(this)

// (2) Extension function on String
fun String.isPalindrome() = this.toLowerCase().let { it == it.reversed() }

// (3) Extension property (getters/setters discussed later)
val String.lastChar
  get() = this[length - 1]


fun main(args: Array<String>) {

  // (4) Called like member methods
  val cry = 3.times("Woah ")
  println(cry)

  println("Kottok".isPalindrome())
  println("Linlin".isPalindrome())

  println("kotlin".lastChar)
}