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
  // Note: these actually exist in Kotlin's stdlib
  // Note: all operators shown in autocomplete when using "operator" modifier
  operator fun BigInteger.plus(other: BigInteger) = this.add(other)
  operator fun BigInteger.minus(other: BigInteger) = this.subtract(other)
  operator fun BigInteger.times(other: BigInteger) = this.multiply(other)
  operator fun BigInteger.div(other: BigInteger) = this.divide(other)

  val x = BigInteger.valueOf(12)
  val y = x + BigInteger.valueOf(29)  // Note: explicit cast to Long necessary (strict)
  val z = y + BigInteger.ONE
  println(z)
}

