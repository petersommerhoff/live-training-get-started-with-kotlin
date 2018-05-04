package _02_collections

import java.time.Instant

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val log = listOf(
      LogEntry(Instant.parse("2018-04-01T19:30:00.00Z"), "Fixed bugs."),
      LogEntry(Instant.parse("2018-04-02T17:15:30.00Z"), "Fixed bugs from last bug fix."),
      LogEntry(Instant.parse("2018-04-03T10:15:30.00Z"), "Maybe we should write tests...")
  )

  // (1) Alternative to explicit for-loop
  log.forEach { println("${it.time}: ${it.text}") }

  // (2) Applicable to any Iterable
  (-5..5).forEach {}
  setOf<Int>().forEach {}
  mapOf<Int, Int>().forEach {}
  "Live Training".forEach {}

  // Note: many more useful library functions to explore!
}