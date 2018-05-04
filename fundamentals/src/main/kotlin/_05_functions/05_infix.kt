package _05_functions

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

fun main(args: Array<String>) {

  // (1) Infix extension function (local to prevent clash)
  infix fun Int.times(str: String) = str.repeat(this)

  println(2 times "Bye ")
  println(5 times "GO ")

  // (2) Remember maps
  val pair = "Ferrari" to "Katrina"
  println(pair)

  // (3) Can create own (non-generic); local functions must be declared before use
  infix fun String.onto(other: String) = Pair(this, other)
  val myPair = "McLaren" onto "Lucas"
  println(myPair)

  // (4) Note: Works same way for member methods
}

