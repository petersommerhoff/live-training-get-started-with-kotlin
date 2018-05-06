package _08_generics

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

fun main(args: Array<String>) {

  // Note: remember Array is invariant in Kotlin (safe)

  // (1) Use-site out-projection makes array covariant
  // Note: try to remove `out` modifier
  val producer: Array<out Number> = arrayOf<Int>(1, 2, 3)

  // (2) Can read from but not write to out-projected producer => safe
//  producer[0] = 0
  println(producer[0])

  // (3) Use-site in-projection makes array contravariant
  val consumer: Array<in Int> = arrayOf<Number>(1.7, 3.01, 4.321)

  // (4) Can only pass in Int, thus safe with Array<Number>
  consumer[0] = 2

  // (5a) Can also read from consumer but returns Any?
  val element: Any? = consumer[0]
  println(element)

  // (5b) More extreme example
  val consumeAny: Array<in Int> = arrayOf<Any?>(null, 3.01, Car(), "One size fits all")
  val any: Any? = consumeAny[0]
  println(any)
}