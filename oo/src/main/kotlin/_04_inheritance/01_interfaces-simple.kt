package _04_inheritance

import java.io.Closeable

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Interfaces represent capabilities
interface Stoppable {
  fun stop()
}

// (2) Implementing an interface
// Note: different syntax, no parentheses
class Movie(val name: String) : Stoppable {

  // (3) override is public keyword (must be used here)
  override fun stop() {
    println("Stopped playing $name")
  }
}

// (3) Implement predefined interface
// Note: may add capabilities, e.g. here use {}
class Connection : Closeable {

  override fun close() {
    println("Closed connection.")
  }
}

fun main(args: Array<String>) {

  val potc = Movie("Pirates of the Caribbean")
  potc.stop()

  val conn = Connection()
  conn.use {
    println("Using connection...will be closed automatically.")
  }
}