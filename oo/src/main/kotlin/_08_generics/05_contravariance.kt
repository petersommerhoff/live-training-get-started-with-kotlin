package _08_generics

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

fun main(args: Array<String>) {

  // (1) A PartialOrder<Number>
  val numberOrder: PartialOrder<Number> = object : PartialOrder<Number> {
    override fun lessThanOrEqual(t1: Number, t2: Number) = t1.toDouble() <= t2.toDouble()
  }

  // (2) PartialOrder<Number> can be used in place of PartialOrder<Int>
  val integerOrder: PartialOrder<Int> = numberOrder

  println(integerOrder.lessThanOrEqual(0, 4))
  println(integerOrder.lessThanOrEqual(17, 17))
  println(integerOrder.lessThanOrEqual(18, 17))
  println(integerOrder.lessThanOrEqual(-1, 1))
  println(integerOrder.lessThanOrEqual(1, -Int.MAX_VALUE))
}