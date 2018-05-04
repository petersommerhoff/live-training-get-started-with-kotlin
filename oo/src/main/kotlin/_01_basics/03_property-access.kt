package _01_basics

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val box = IntBox3(9001)
  val mutable = MutableIntBox(9001)

  // (1) Looks like direct field access (bad practice) but IS NOT!
  // (2) Internally calls getter (implicitly defined)
  val power = box.value

  // (3) Calls implicit setter
  // (4) Not bad practice at all, idiomatic (no violation of information hiding)
  mutable.value = 10_000
}

class MutableIntBox(var value: Int)