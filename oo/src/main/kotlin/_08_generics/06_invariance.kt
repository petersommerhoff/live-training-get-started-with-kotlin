package _08_generics

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Look again at [_08_generics.MutableStack] in 02_generics: cannot be variant

// (2) Whenever generic type parameter both in in-position and out-position
// Note: add in/out modifier and show static analysis errors
interface ProducerAndConsumer<T> {
  fun produce(): T
  fun consume(t: T)
}

// (3) Can still be variant of different generic type parameters are in/out
interface Function<in T, out R> {
  fun apply(t: T): R
}

class Squared : Function<Double, Double> {
  override fun apply(t: Double) = Math.pow(t, 2.0)
}

fun main(args: Array<String>) {

  // (4) First generic type cannot be Number (because in-projected)
  // Note: variable wants a function returning Number, Squared does that
  val operation: Function<Double, Number> = Squared()
  println(operation.apply(12.0))
}