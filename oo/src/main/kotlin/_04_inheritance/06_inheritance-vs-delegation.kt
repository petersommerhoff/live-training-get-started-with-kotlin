package _04_inheritance

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 *
 * Based on Item 16 "Favor composition over inheritance" from "Effective Java" by Josh Bloch
 */

// (1) Composition/delegation would be preferable here
// Note: inheritance breaks principle of encapsulation (information hiding)
class InstrumentedHashSet1<E> : HashSet<E>() {

  var addCount = 0
    private set

  override fun add(element: E): Boolean {
    addCount++
    return super.add(element)
  }

  override fun addAll(elements: Collection<E>): Boolean {
    // (3a) Depends on implementation details of superclass which calls add() for addAll()
    // Note: could remove this line to fix but we'd still rely on the superclass' implementation details
    addCount += elements.size
    return super.addAll(elements)
  }
}

// (4a) Better solution using composition/delegation
// (4b) Forwarding class for MutableSet interface (only needed once per interface)
// Note: huge class in Java, full of just boilerplate
open class ForwardingMutableSet<E>(set: MutableSet<E>) : MutableSet<E> by set

// (5) Can now extend ForwardingSet which delegates to its given set instead of using inheritance
// Note: same logic as above
class InstrumentedHashSet2<E> : ForwardingMutableSet<E>(mutableSetOf()) {

  var addCount = 0
    private set

  override fun add(element: E): Boolean {
    addCount++
    return super.add(element)
  }

  override fun addAll(elements: Collection<E>): Boolean {
    addCount += elements.size
    return super.addAll(elements)
  }
}

fun main(args: Array<String>) {

  val usingInheritance = InstrumentedHashSet1<Int>()
  usingInheritance.addAll(listOf(1, 2, 3))

  // (2) Should print 3 but prints 6
  println(usingInheritance.addCount)

  // (6) Prints 3 as expected
  val usingDelegation = InstrumentedHashSet2<Int>()
  usingDelegation.addAll(listOf(1, 2, 3))

  println(usingDelegation.addCount)
}