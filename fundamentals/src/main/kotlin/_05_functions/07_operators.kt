package _05_functions

import java.math.BigInteger

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

fun main(args: Array<String>) {

  // (1) Operator extension function (local to prevent clash)
  operator fun Int.times(str: String) = str.repeat(this)

  // (2) times() defines * operator
  println(2 * "Bye ")
  println(5 * "GO ")

  // (3) Range access for strings
  operator fun String.get(range: IntRange) = substring(range)

  val str = "Always forgive your enemies; nothing annoys them so much."
  println(str[0..14])

  // (4) Other operators
  operator fun BigInteger.plus(other: BigInteger) = this.add(other)  // actually done in Kotlin stdlib
  operator fun BigInteger.minus(other: BigInteger) = this.subtract(other)  // actually done in Kotlin stdlib
  operator fun BigInteger.times(other: BigInteger) = this.multiply(other)  // actually done in Kotlin stdlib
  operator fun BigInteger.div(other: BigInteger) = this.divide(other)  // actually done in Kotlin stdlib
  // Note: all shown in autocomplete when using "operator" modifier

  val x = BigInteger.valueOf(Long.MAX_VALUE)
  x.add(BigInteger.valueOf(Int.MAX_VALUE.toLong()))  // Note: explicit cast necessary (strict type system)
  x.add(BigInteger.ONE)
  println(x)
}

