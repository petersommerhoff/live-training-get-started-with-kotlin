package _08_lab

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// Using prefixes to prevent clashes while solving task in exercise03.kt
interface MyFunction<in T1, in T2, out R> {
  fun apply(t1: T1, t2: T2): R
}

object Plus : MyFunction<Number, Number, Double> {
  override fun apply(t1: Number, t2: Number): Double = t1.toDouble() + t2.toDouble()
}

object Repeat : MyFunction<Int, () -> Unit, Unit> {
  override fun apply(t1: Int, t2: () -> Unit) {
    for (i in 1..t1) t2()
  }
}

fun main(args: Array<String>) {

  val plus1: MyFunction<Int, Int, Any> = Plus
  val plus2: MyFunction<Number, Int, Number> = Plus

  val repeat = Repeat
  repeat.apply(5) {
    println("And then?")
  }
}