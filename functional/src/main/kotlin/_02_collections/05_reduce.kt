package _02_collections

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Same as fold but without initial element
// Note: better whenever fold just uses neutral element of the operation
fun reduceToSum(numbers: Array<Int>) = numbers.reduce { acc, i -> acc + i }

fun main(args: Array<String>) {

  // (1)
  val sequence = arrayOf(1, 11, 21, 1211, 111221)
  println(reduceToSum(sequence))

}
