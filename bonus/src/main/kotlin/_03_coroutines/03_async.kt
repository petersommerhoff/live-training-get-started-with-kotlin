package _03_coroutines

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlin.system.measureTimeMillis

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

fun fetchOneAsync() = async {
  delay(1000)
  7
}

fun fetchTwoAsync() = async {
  delay(1000)
  6
}

fun main(args: Array<String>) = runBlocking {

  val time = measureTimeMillis {
    val one = fetchOneAsync()
    val two = fetchTwoAsync()

    println("Result: ${one.await() * two.await()}")
  }

  println("Took $time ms")
}