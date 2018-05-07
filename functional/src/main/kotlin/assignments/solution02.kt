package assignments

import java.math.BigDecimal
import java.util.*

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// 1) an extension property BD on Int that returns a BigDecimal representation of the Int
val Int.BD
  get() = BigDecimal(this)

// 2) an extension function copy() on MutableList<Int> that returns a copy of the mutable receiver list
fun MutableList<Int>.copy(): MutableList<Int> = ArrayList(this)


fun main(args: Array<String>) {

  // 1)
  val a = 17.BD
  val b = 25.BD
  println(a + b)

  // 2)
  val list1 = mutableListOf(1,2,3)
  val same = list1
  same.add(4)
  println(list1)

  val list2 = mutableListOf(1,2,3)
  val copy = list2.copy()
  copy.add(4)
  println(list2)
}