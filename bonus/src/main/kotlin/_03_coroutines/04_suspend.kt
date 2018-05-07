package _03_coroutines

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking
import kotlin.system.measureTimeMillis

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

suspend fun fetchOne(): Int {
  delay(1000)
  return 7
}

suspend fun fetchTwo(): Int {
  delay(1000)
  return 6
}

fun main(args: Array<String>) = runBlocking {

  val time = measureTimeMillis {
    val one = async { fetchOne() }
    val two = async { fetchTwo() }

    println("Result: ${one.await() * two.await()}")
  }

  println("Took $time ms")
}