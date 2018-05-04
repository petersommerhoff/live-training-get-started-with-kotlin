@file:JvmName("Nothing")

package _08_exceptions

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Nothing return type indicates non-termination
fun fail(message: String): Nothing = throw IllegalArgumentException(message)

fun nameOrNull(): String? = null

fun main(args: Array<String>) {

  if (args.isEmpty() || args[0].isBlank()) {
//    fail("Please pass your username as a program argument")

    // (2) Dead code (compiler knows)
    println("Will never happen")
  }

  // (3) Non-null type inference
  val input = nameOrNull() ?: fail("Please enter a username")  // Inferred type: String
  input.trim()

  // (4) Excursus
  // (4a) Cannot create instance
//  val nothing: Nothing = ???

  // (4b) Nothing? is the type of just null
  val nothingOrNull: Nothing? = null

  // (4c) There's no Nothing type in Java (everything has at least null), see JClass
}