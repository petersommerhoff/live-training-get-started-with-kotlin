package _08_generics

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) A read-only, generic Stack data structure (out-projected)
// Note: try to add a push() method
class Stack<out T>(val elements: List<T>) {

  // (2) T may appear in in-position only in constructors (safe)
  constructor(vararg initialElements: T) : this(initialElements.toList())

  fun peek(): T = elements.last()

  fun pop(): Stack<T> {
    if (isEmpty()) throw NoSuchElementException("Cannot pop from empty Stack.")
    return Stack(elements.subList(0, elements.size - 1))
  }

  fun isEmpty() = elements.isEmpty()

  override fun toString() = "Stack(${elements.joinToString()})"
}

// (3) Generic helper function
fun <T> stackOf(vararg elements: T) = Stack(*elements)

fun main(args: Array<String>) {

  val stack = stackOf(4, 8, 15, 16, 23, 42)
  println(stack.peek())
  println(stack.isEmpty())
  println(stack.pop())
}

