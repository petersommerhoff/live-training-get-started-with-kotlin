package _06_nullhandling

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Elvis operator to throw exception if null
// Note: generics later (don't want to return Any)
fun requireNotNull(any: Any?): Any = any ?: throw IllegalArgumentException("$any must not be null.")

fun main(args: Array<String>) {

  var name = ""

  while (name == "") {
    println("What's your name?")
    print("> ")

    // (2) Elvis operator to provide default value
    name = readLine() ?: ""
  }

  println("Welcome back $name!")
}