package _07_checks

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val thing: Any = 9.80665

  // (1) Type cast with "as"
  val gravity = (thing as Double)
  println("The standard gravity is $gravity")

  // (2) Original and cast type may be nameOrNull
  val anything: Any? = "Be the change you wish to see in the world."
  val quote = (anything as String?)
  println(quote)

  // (3) ClassCastException
  val wrong = (anything as Long)

  // (3) Sidenote: don't do this (see type)
  val init = null
}