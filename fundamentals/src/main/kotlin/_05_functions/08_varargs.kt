package _05_functions

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Function with vararg parameter
fun printAll(vararg messages: String) {
  for (m in messages) println(m)
}

// (2) Prefix possible thanks to named parameters
fun printAllWithPrefix(vararg messages: String, prefix: String) {
  for (m in messages) println(prefix + m)
}

// (3) Varargs are arrays at runtime => spread operator
fun log(vararg entries: String) {
  printAll(*entries)
}

fun main(args: Array<String>) {

  // (4) Called with any number of comma-separated values
  printAll("Hello", "Hallo", "Salut", "Hola", "你好")
  printAllWithPrefix("Hello", "Hallo", "Salut", "Hola", "你好", prefix = "Greeting: ")
  log("Finished printing", "Program will now quit")

  // Note: Can be combined with parameters of other type before or after vararg
}