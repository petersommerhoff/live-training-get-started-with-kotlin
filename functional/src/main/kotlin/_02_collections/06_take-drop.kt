package _02_collections

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val evenNumbers = List(1000) { it * 2 }

  // (1) Take first 10 elements
  val firstTen = evenNumbers.take(10)
  println(firstTen)

  // (2) Drop first 990 elements
  val lastTen = evenNumbers.drop(evenNumbers.size - 10)
  println(lastTen)

  // (3) Take 20 elements from the middle
  val middleTwenty = evenNumbers.drop(evenNumbers.size / 2 - 10).take(20)
  println(middleTwenty)

  // Note: these will be crucial for infinite sequences
}