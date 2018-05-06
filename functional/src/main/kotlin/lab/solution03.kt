package lab

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// Using main() as scope to prevent clashes while solving task in exercise03.kt
fun main(args: Array<String>) {

  // 1) the sequence of all multiples of 5 (starting at zero)
  val multipleOfFive = generateSequence(0) { it + 5 }

  // 2) the sequence 1, 1/2, 2, 1/3, 3, 1/4, 4, 1/5, 5, ...
  val alternating = generateSequence(1.0) {
    if (it >= 1.0) {
      1.0 / (it + 1)
    } else {
      1.0 / it
    }
  }

  // 3) the sequence of lists of 0 where each element has one more 0 than its predecessor (starting at zero elements)
  fun listOfZeros(size: Int): List<Int> {
    val zeros = mutableListOf<Int>()
    repeat(size) { zeros.add(0) }
    return zeros
  }

  val listOfZeros = generateSequence(listOf<Int>()) {
    listOfZeros(it.size + 1)
  }


  // Quick checks
  // 1) the first 10 elements from your first sequence
  println(multipleOfFive.take(10).joinToString())

  // 2) the first 5 elements and elements 16 to 20 from your second sequence
  println(alternating.take(5).joinToString())
  println(alternating.drop(15).take(5).joinToString())

  // 3) the first element and elements 4 to 6 from your third sequence
  println(listOfZeros.first())
  println(listOfZeros.drop(3).take(3).joinToString())
}
