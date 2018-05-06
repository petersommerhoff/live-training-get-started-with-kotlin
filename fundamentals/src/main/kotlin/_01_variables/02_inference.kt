package _01_variables

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // (1) Explicit type
  val greeting: String = "Hello"

  // (2) Type inference
  val addressee = "World"  // Inferred type: String
  val age = 42             // Inferred type: Int
  val pi = 3.14159         // Inferred type: Double

  // Java 10 wants to introduce type inference
}