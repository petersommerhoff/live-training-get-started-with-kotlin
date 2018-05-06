package _08_generics

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Don't know anything about the generic type but want type safety
// Note: function not generic, no type parameter
fun printAllStar(values: Array<*>) {
  values.forEach { println(it) }
}

// (2) Array<Any?> is not the same as Array<*> as shown below
// Note: but Array<out Any?> is basically the same
fun printAllAny(values: Array<Any?>) {
  values.forEach { println(it) }
}

// (5) Star projection maps to appropriate types for reading/writing to preserve safety
fun readWrite(list: MutableList<*>) {

  // (6) Can only safely infer Any? if T is unknown
  val read: Any? = list[0]

  // (7) Cannot safely write to list with unknown T (may be List<Nothing>)
//  list[0] = ?
}

fun main(args: Array<String>) {

  // (3) Array<*> accepts arrays of arbitrary type
  printAllStar(arrayOf("Algebra", "Calculus", "Probability Theory"))
  printAllStar(arrayOf(5, 4, 3, 2, 1))
  printAllStar(arrayOf(null, Any(), Unit))

  // (4) Array<Any?> only accepts exactly Array<Any?> because not covariant (unless Array<out Any?>)
//  printAllAny(arrayOf<String>("Algebra", "Calculus", "Probability Theory"))
//  printAllAny(arrayOf<Int>(5, 4, 3, 2, 1))
  printAllAny(arrayOf<Any?>(null, Any(), Unit))
}

