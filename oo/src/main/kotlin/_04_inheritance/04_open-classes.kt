package _04_inheritance

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Cannot inherit from regular class
class Closed
//class ChildOfClosed : Closed()

// (2) Open classes allow inheritance
open class Open
class ChildOfOpen : Open()

// (3) Child not automatically open again => ends inheritance hierarchy
//class GrandchildOfOpen : ChildOfOpen()

// (4) Same principle for class members
// Note: could also make constructor parameters open
open class Room(val sqm: Double) {
  open fun estimateMonthlyRent() = sqm * 10
}

open class Bathroom(sqm: Double, val modern: Boolean) : Room(sqm) {  // (5) Passing along parameters

  // (6) Overriding open method (same for properties)
  override fun estimateMonthlyRent(): Double {
    val base = super.estimateMonthlyRent()
    return if (modern) base * 1.10 else base
  }
}

// Exercise: create open class Being(name, weight) with subclasses Human(name, weight, birthday) and Bacteria(name, weight, goodOrBad)