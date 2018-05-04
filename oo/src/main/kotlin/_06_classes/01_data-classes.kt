package _06_classes

import _01_basics.Person

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Data class to store address data
// Note: must all have val/var, cannot be open/abstract, cannot be sealed/inner
data class Address(val street: String, val number: Int, val zip: String, val city: String) {

  // (1a) Can have properties and methods as usual
  // Note: though often one-liner
  val prop: Double = 1.0
  fun isInBerlin() = city.toLowerCase() == "berlin"
}

fun main(args: Array<String>) {

  // (2) Initialized as usual
  // Note: two objects, same data
  val csBuilding = Address("Ahornstrasse", 55, "52072", "Aachen")
  val computerScienceBuilding = Address("Ahornstrasse", 55, "52072", "Aachen")

  // (3) toString()
  println(csBuilding)

  // (4) equals()
  println(computerScienceBuilding == csBuilding)   // true
  println(computerScienceBuilding === csBuilding)  // false

  // (5) hashCode()
  println(hashSetOf(computerScienceBuilding, csBuilding).size)  // 1
  println(hashSetOf(Person("Carl", 14), Person("Carl", 14)).size)  // 2

  // (6) Destructuring operator
  val (street, _, _, city) = computerScienceBuilding
  println(city)
  println(street)

  // (7) copy() function
  val neighbor = csBuilding.copy(number = 57)
  println(neighbor)
}