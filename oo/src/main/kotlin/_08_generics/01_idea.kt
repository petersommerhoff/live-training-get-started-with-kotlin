package _08_generics

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Non-generic stack data structure
class IntStack(vararg ints: Int) {
  val elements = mutableListOf<Int>()

  init { ints.forEach { elements.add(it) } }

  fun push(element: Int) { elements.add(element) }
  fun pop() = elements.last()
  fun isEmpty() = elements.isEmpty()
}

// (2a) Literally copy-pasted code with Int changed to String
// (2b) Definitely not following DRY principle!
class StringStack(vararg strings: String) {
  val elements = mutableListOf<String>()

  init { strings.forEach { elements.add(it) } }

  fun push(element: String) { elements.add(element) }
  fun pop() = elements.last()
  fun isEmpty() = elements.isEmpty()
}

fun main(args: Array<String>) {

  val ints = IntStack(1, 2, 3)
  val strings = StringStack("a", "b", "c")

  // (3) What if I want a stack storing doubles? Or cards? Or books?
}
