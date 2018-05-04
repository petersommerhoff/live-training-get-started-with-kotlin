package _05_functions

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Without parameter or return value
// Note: top-level function, no need for class
fun helloWorld() {
  println("Hello World")
}

// (2) With parameter but without return value (Unit)
fun greet(name: String) {
  println(greeting(name))
}

// (3) With parameter and return value
fun greeting(name: String): String {
  return "Hey there $name!"
}

fun main(args: Array<String>) {
  helloWorld()
  greet("Jack")
  greet("Jane")
}