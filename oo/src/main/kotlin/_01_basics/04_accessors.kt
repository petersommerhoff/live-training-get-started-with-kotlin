package _01_basics

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Shorthand primary constructor properties no longer possible
class Person(name: String, age: Int) {

  // (2) Property declaration with custom get() and set()
  var name: String = name
    get() = field.capitalize()  // (3) Backing field access
    set(value) {
      if (value.length < 2) throw IllegalArgumentException("Person#name must be at least two characters long.")
      field = value  // (4) Backing field access (otherwise recursion)
    }

  // (5) Property with only custom setter
  var age: Int = age
    set(value) {
      field = if (value >= 0) value else throw IllegalArgumentException("Person#age must be non-negative.")
    }
}


fun main(args: Array<String>) {

  val bill = Person("bill", 62)

  println(bill.name)  // (6) Getter access
  bill.name = "gates"  // (7) Setter access
  println(bill.name)  // (8) Getter access

  println(bill.age)  // (9) Getter access
  bill.age = -62  // (10) Setter access, throws exception

}