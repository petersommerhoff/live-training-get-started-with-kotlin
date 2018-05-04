package _02_types

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // (1) Creating an array
  val simpsons = arrayOf("Homer", "Marge", "Bart", "Lisa", "Maggie")
  println(simpsons)

  val bart = simpsons[2]
  println(bart)

  simpsons[4] = "Maggy"  // Note that val != immutable

  // (2) Arrays of primitive types
  val numbers = intArrayOf(4, 8, 15, 16, 23, 42)  // Note: becomes int[] instead of Integer[] on JVM
  println(numbers.joinToString())
}