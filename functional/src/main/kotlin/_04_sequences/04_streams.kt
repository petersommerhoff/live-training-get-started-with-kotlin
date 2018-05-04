package _04_sequences

import java.util.stream.Collectors
import java.util.stream.IntStream

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // (1) Sequences ~ Java Streams (just better)
  // Note: Kotlin compatible with Java 6 (Android)
  val stream = IntStream.iterate(0) { it + 1 }
  val sequence = generateSequence(0) { it + 1 }

  val list1 = stream.filter { it % 2 == 0 }
      .mapToObj { "Element #$it" }
      .limit(10)
      .collect(Collectors.toList<String>())

  val list2 = sequence.filter { it % 2 == 0 }
      .map { "Element #$it" }
      .take(10)
      .toList()

  println(list1)
  println(list2)
}