package _01_basics

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Java-way to have property isInitialized in constructor
// Note: boilerplate!
class IntBox1 {
  val value: Int

  constructor(value: Int) {
    this.value = value
  }
}

// (2) Better way using primary constructor
// Note: still boilerplate
class IntBox2(value: Int) {
  val value: Int = value
}

// (3) Idiomatic and best way using shorthand
class IntBox3(val value: Int)

fun main(args: Array<String>) {

  // (4) Initializing object now with parameter
  // Note: all classes semantically the same
  val box1 = IntBox1(1337)
  val box2 = IntBox2(1337)
  val box3 = IntBox3(1337)
}