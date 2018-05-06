package _05_functions

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Default values in function signature
// Note: prefer to overloading
fun fuzzyEqual(a: String, b: String, trimWhitespace: Boolean = true, ignoreCase: Boolean = true) = when {
    ignoreCase && trimWhitespace -> a.trim().toLowerCase() == b.trim().toLowerCase()
    ignoreCase && !trimWhitespace -> a.toLowerCase() == b.toLowerCase()
    !ignoreCase && trimWhitespace -> a.trim() == b.trim()
    !ignoreCase && !trimWhitespace -> a == b
    else -> throw IllegalStateException("Should never happen")
}

fun main(args: Array<String>) {

  val title = "Game of Thrones"
  val fuzzy = "  game OF thrones    "

  // (2) May skip arguments if default value defined
  println(fuzzyEqual(title, fuzzy))

  // (3) Use named parameters to pass arguments in any order
  println(fuzzyEqual(title, fuzzy, ignoreCase = false))
  println(fuzzyEqual(title, fuzzy, trimWhitespace = false))
}
