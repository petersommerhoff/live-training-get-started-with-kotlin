package _04_sequences

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // (1) Collection: eager evaluation
  val collection = listOf("IntelliJ", "Eclipse", "NetBeans")

  println("--- Eager evaluation on collection ---")
  collection.filter {
    println("filter: $it")
    it.length > 5
  }.map {
    println("map: $it")
    "$it is a Java IDE"
  }

  // (2) Sequences: lazy evaluation
  val sequence = sequenceOf("IntelliJ", "Eclipse", "NetBeans")

  println("--- Lazy evaluation on sequence ---")
  sequence.filter {
    println("filter: $it")
    it.length > 5
  }.map {
    println("map: $it")
    "$it is a Java IDE"
  }.toList()  // Note: need an action to trigger computation
}