package _08_generics

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

open class Person(val name: CharSequence) {
  open fun greet(): CharSequence = "Hi $name"
}

open class Friend(name: CharSequence) : Person(name) {
  // (4) Return types are covariant (String <: CharSequence)
  // Note: final override ends overriding of this method
  final override fun greet(): String = "Hey $name!"
}

fun main(args: Array<String>) {

  // (1a) Assignments allow covariance
  // (1b) Subtype Double can be used in place of supertype Number
  val number: Number = 42.0

  // (2) Parameters allow covariance (String <: CharSequence)
  val friend = Friend("John Doe")

  // (3) Kotlin's read-only collections are covariant
  // Note: good practice to use most abstract interface
  val invited: List<Person> = listOf(friend)
}