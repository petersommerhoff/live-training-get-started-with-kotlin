package _04_sequences

import kotlin.coroutines.experimental.buildSequence

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // (1) Infinite sequence of natural numbers
  val nats = generateSequence(0) { it + 1 }

  println(nats.take(10).toList())  // Note: don't forget take(), and again we require an action

  // (2) Infinite sequence of powers of two
  val powersOfTwo = generateSequence(1) { it * 2 }

  println(powersOfTwo.take(10).toList())

  // (3) Infinite sequence of Fibonacci numbers
  val fibs = generateSequence(Pair(0, 1)) { // Note: recursive algorithm with "look-back" more than one
    Pair(it.second, it.first + it.second)
  }.map { it.first }

  println(fibs.take(10).toList())

  // (4) Infinite sequence of prime numbers (Sieve of Eratosthenes)
  val startSequence = generateSequence(2, { it + 1 })
  val primes = generateSequence(startSequence) {
    val nextPrime = it.first()
    val sieved = it.filterNot { it % nextPrime == 0 }
    sieved
  }.map { it.first() }

  println(primes.take(20).toList())

  // (5) Alternative: generators with buildSequence
  val fibsGenerator = buildSequence {
    var current = 0L
    var next = 1L
    while (true) {
      yield(current)  // Note: sequential-style code; yield ~ return
      val temp = current
      current = next
      next += temp
    }
  }
  println(fibsGenerator.take(10).toList())
}