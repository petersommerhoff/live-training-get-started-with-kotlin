package _02_types

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // 1) Read-only lists
  val fixed = listOf(4, 8, 15, 16, 23, 42)
//  numbers.add()
  println(fixed)

  val second = fixed[1]
  println(second)

  // 2) Mutable lists
  val numbers = mutableListOf(0, 1, 1, 2)
  numbers.add(3)

  val rest = listOf(5, 8, 13)
  numbers.addAll(rest)
  println(numbers)

  numbers.removeAt(0)
  numbers.remove(13)
  println(numbers)
}