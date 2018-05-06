package _07_objects

import java.util.regex.Pattern

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

class Regex {

  // (1a) Regular object declaration but with companion modifier
  // (1b) Default name "Companion" if none specified
  companion object {
    fun fromLiteral(literal: String) = Pattern.compile(literal).toRegex()
  }
}

interface CarFactory {
  fun build(): Car
}

class Car(val manufacturer: String, val model: String) {

  // (2) Can inherit classes and interfaces as usual
  companion object Factory : CarFactory {
    override fun build(): Car = Car("Tesla", "Model S")
  }

  override fun toString() = "$manufacturer $model"
}

fun main(args: Array<String>) {

  // (3) Companion members are callable directly on class (like static members in Java)
  val nameRegex = Regex.fromLiteral("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$")
  println(nameRegex.matches("peter@petersommerhoff.com"))
  println(nameRegex.matches("john@example"))

  // (4) Alternative ways to call
  val car1 = Car.build()
  val car2 = Car.Factory.build()

  println(car1)
  println(car2)
}
