package _03_coroutines

import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

fun main(args: Array<String>) = runBlocking {
  println("Started main()")

  val job = launch {
    println("Started coroutine!")
    delay(500)
    println("Finished coroutine!")
  }

  println("Waiting for coroutine to finish...")
  job.join()
  println("End of main()")
}