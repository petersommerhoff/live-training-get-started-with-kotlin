package _08_generics

import java.util.*

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Simple function to copy data from one array to another -- looks fine at first
// Note: add in/out projections to enable code below
fun copyAll(from: Array<Any>, to: Array<Any>) {
  val result = Arrays.copyOf(from, from.size + to.size)
  for ((i, element) in to.withIndex()) {
    result[from.size + i] = element
  }
}

fun main(args: Array<String>) {
  val anyArray: Array<Any> = arrayOf(3, 5.9)
  val strArray: Array<String> = arrayOf("Kotlin", "Android")

  // (2a) Cannot copy from Array<String> to Array<Any> even though it's safe
  // (2b) We need type projection (similar to use-site variance)
//    copyAll(strArray, anyArray)

  // (3) Should never be allowed, and isn't (unsafe)
//  copyAll(anyArray, strArray)
}