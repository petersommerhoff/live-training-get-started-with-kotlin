package _07_checks

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val a = mapOf(0 to 'a', 1 to 'b', 2 to 'c')

  // (1) Guess which one
  // Note: thus just read-only, not immutable
  val type = when (a) {
    is MutableMap -> "MutableMap"
    is Map -> "Map"
    else -> "None of the above"
  }

  println("The map is a $type")

  // (2) Interop trade-off: there are only mutable collections in Java
  (a as MutableMap<Int, Char>).put(3, 'd')
  println(a)

  // Note: If you want to hurt yourself, you can. Best practice: don't.
}