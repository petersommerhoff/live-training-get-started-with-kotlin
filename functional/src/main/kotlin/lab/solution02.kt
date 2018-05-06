package lab

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */


// Using main() as scope to prevent clashes while solving task in exercise02.kt
fun main(args: Array<String>) {

  // 1) a list of only the non-negative numbers
  val nonNegatives = original.filter { it >= 0 }
  println(nonNegatives)

  // 2) a list where every even number is replaced by zero
  val evenToZero = original.map { if (it % 2 == 0) 0 else it }
  println(evenToZero)

  // 3) a list where all negative numbers are turned positive
  val negativesToPositives = original.map { if (it < 0) -it else it }
  println(negativesToPositives)

  // 4) also compute the sum of all elements in `original` in one line
  val sum = original.reduce { acc, i -> acc + i }
  println(sum)
  println(sum == original.sum())
}
