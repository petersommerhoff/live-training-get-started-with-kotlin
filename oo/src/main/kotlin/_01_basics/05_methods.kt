package _01_basics

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

class Foo(var value: Int) {

  // (1) Regular method
  fun regular(name: String = "function") { println("Just public regular $name") }

  // (2) Infix method (single parameter)
  infix fun with(other: Foo) = this + other

  // (3) Operator method
  operator fun plus(other: Foo) = Foo(this.value + other.value)

  // (4) Inline method
  inline fun iterate(times: Int, op: (Int) -> Int) {
    repeat(times) { value = op(value) }
  }

  // (5) Extension function
  // Note: Int is called extension receiver, Foo is dispatch receiver
  fun Int.printWithDispatchReceiver() {
    println(toString())
    println(this@Foo.toString())
  }
}

fun main(args: Array<String>) {

  val foo = Foo(111)
  val other = Foo(12)

  foo.regular()
  println(foo.with(other).value)
  println((foo + other).value)

  println(foo.iterate(2, { x -> x * 2 }))
  println(foo.value)

  with(foo) {
    1337.printWithDispatchReceiver()
  }
}