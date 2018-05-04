package _01_higherorder

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Similar to repeat() from stdlib
// (2) Denote function type as always
fun loop(times: Int, operation: (Int) -> Unit) {
  for (i in 0 until times) operation(i)
}

// (3) Very powerful with extension functions
infix fun String.onEachWord(operation: (String) -> Unit) =
  this.split(" ").onEach(operation)

fun main(args: Array<String>) {

  //
  // Sidenote: no parentheses required (explained later)
  loop(3) { index ->
    println("Lucky loop -- $index")
  }

  "Hey there Kotlin lovers".onEachWord({ word -> println(word.toUpperCase()) })  // Sidenote: shorter form later
}