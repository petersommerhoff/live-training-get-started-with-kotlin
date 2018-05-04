package _04_loops

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // Loops from 0 to 10 (end-inclusive => 11 iterations)
  for (i in 0..10) {
    print("$i ")
  }
  println()

  // Loops from 0 to 9 (end-exclusive => 10 iterations)
  for (i in 0 until 10) {
    print("$i ")
  }
  println()

  // Loops from 0 to 10 in steps of 2 (6 iterations)
  for (i in 0..10 step 2) {
    print("$i ")
  }
  println()

  // Loops from 10 down to 0 in reverse order (11 iterations)
  for (i in 10 downTo 0) {
    print("$i ")
  }
  println()

  // Loops from 10 down to 0 in steps of 3 (4 iterations)
  for (i in 10 downTo 0 step 3) {
    print("$i ")
  }
  println()

  // Negative numbers in ranges are no problem
  for (i in -50..-5 step 5) {
    print("$i ")
  }
  println()
}