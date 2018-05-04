package _03_scoping

import java.io.File

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // Note: not really a scoping function, only for Closeables

  // (1) For any Closeable (= try-with-resources)
  val path = "functional/src/main/kotlin/_02_collections/Entities.kt"
  val reader = File(path).bufferedReader().use {
    val header = it.readLine()
    println(header)
    // (2) Automatically closes reader in any case (in finally block)
  }
}