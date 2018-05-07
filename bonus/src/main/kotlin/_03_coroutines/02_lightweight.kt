package _03_coroutines

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import kotlin.system.measureTimeMillis

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) = runBlocking {

  val time = measureTimeMillis {
    // Launch 100,000 coroutines
    val jobs = List(100_000) {
      launch {
        delay(1000)
        print("+")
      }
    }

    jobs.forEach { it.join() }
  }

  println()
  println("Took $time ms")

  // Launches 100,000 threads (produces out-of-memory error on some machines)
//  val threads = List(100_000) {
//    thread {
//      Thread.sleep(1000)
//      print(".")
//    }
//  }
//
//  threads.forEach { it.join() }
}