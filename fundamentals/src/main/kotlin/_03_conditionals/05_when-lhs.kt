package _03_conditionals

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

const val QUIT_SYMBOL = 'q'  // Note: compile-time constant

fun main(args: Array<String>) {

  val input = 'p'

  // Expression on LHS => simple equality check; in/is different
  when (input.toLowerCase()) {
    !in validInputs()   -> println("Please enter a character from a-z")  // Function call / !in
    in listOf('k', 'n') -> println("Moved to next element")              // in
    'x'                 -> println("Selected current element")           // Literal
    QUIT_SYMBOL         -> println("Bye bye!")                           // Constant / value
    !is Char            -> println("Something went wrong")               // Type check / is
    else                -> println("Nothing to do")                      // Default case
  }
}

// Functions are discussed in detail later
fun validInputs(): CharRange {
  return 'a'..'z'
}