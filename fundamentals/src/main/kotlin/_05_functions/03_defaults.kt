package _05_functions

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// 1) Default values remove need for overloading in most cases
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
  println(fuzzyEqual(title, fuzzy))
  println(fuzzyEqual(title, fuzzy, ignoreCase = false))  // Note: named parameters
  println(fuzzyEqual(title, fuzzy, trimWhitespace = false))
}
