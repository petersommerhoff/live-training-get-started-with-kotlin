package _01_oo

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Simple typealias
typealias Predicate<T> = (T) -> Boolean

// (2) Use for migrating
// (2a) Old class
@Deprecated("Use StringBuilder instead", ReplaceWith("StringBuilder"))
class StringBuffer

// (2b) New class (you will provide the implementation e.g. next release)
typealias StringBuilder = StringBuffer

fun main(args: Array<String>) {

  // (2c) Users are nudged to migrate
  val builder = StringBuffer()

  val condition: Predicate<Int> = { it >= 0 }
}