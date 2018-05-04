package _04_sequences

import kotlin.system.measureTimeMillis

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // Note: not a benchmark

  // (1) Eager evaluation
  val list = (1..2_000_000)
  var result: Long = -1

  val timeEager = measureTimeMillis {
    result = list.filter {
      it % 2 == 1
    }.map {
      (Math.pow(it.toDouble(), 2.0) * 13 / 156).toInt()
    }.take(10)  // Note: should actually be done as early as possible
        .map { fibonacci(it) }
        .reduce { acc, i -> acc + i }
  }
  println("Eagerly computed result in $timeEager ms: $result")

  // (2) Lazy evaluation
  val sequence = list.asSequence()  // Note: transforming collections to sequences

  val timeLazy = measureTimeMillis {
    result = sequence.filter {
      it % 2 == 1
    }.map {
      (Math.pow(it.toDouble(), 2.0) * 13 / 156).toInt()
    }.take(10)
        .map { fibonacci(it) }
        .reduce { acc, i -> acc + i }
  }

  println("Lazily computed result in $timeLazy ms: $result")

  // Note: consider sequences for very long lists and for expensive operations
}



fun fibonacci(n: Int): Long {
  if (n < 0) throw IllegalArgumentException("n must be non-negative.")
  if (n <= 1) return n.toLong()
  return fibonacci(n - 1) + fibonacci(n - 2)
}