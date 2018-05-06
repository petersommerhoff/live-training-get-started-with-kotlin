package _03_lab

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// Calling it MyVector to avoid clash while solving task in exercise01.kt
class MyIntVector(elements: Collection<Int>) {
  constructor(vararg elements: Int) : this(elements.toList())
  constructor() : this(listOf())
}

fun main(args: Array<String>) {
  val vector1 = MyIntVector()
  val vector2 = MyIntVector(1, 2, 3)
  val vector3 = MyIntVector(listOf(1, 2, 3))
  val vector4 = MyIntVector(setOf(1, 2, 3))
}