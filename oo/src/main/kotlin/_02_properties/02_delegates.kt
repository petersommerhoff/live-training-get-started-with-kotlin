package _02_properties

import java.time.LocalDate
import java.time.temporal.ChronoUnit
import kotlin.properties.Delegates

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

class Dog(birthday: LocalDate) {

  // (1) Lazy property, computed on demand (then cached)
  val age: Int by lazy {
    println("Computing age...")
    Thread.sleep(500)  // Note: simulate expensive operation
    birthday.until(LocalDate.now(), ChronoUnit.YEARS).toInt()
  }

  // (2) Observable property, allows reacting to changes
  var status: String by Delegates.observable("Sleeping", { property, oldValue, newValue ->
    println("${property.name} was changed: $oldValue -> $newValue")
    when (newValue) {
      "Sleeping" -> println("Gotta get some sleep")  // Note: enums later
      "Eating" -> println("Gotta get some food")
    }
  })

  // (3) Vetoable property, allows interception (decide whether to accept change)
  var mood: String by Delegates.vetoable("Happy", { property, oldValue, newValue ->
    println("${property.name} was changed: $oldValue -> $newValue")
    when (newValue) {
      "Grumpy" -> {
        println("Now I'm grumpy!")
        true  // Note: accept value change
      }
      "Happy" -> {
        println("I'm happy :)")
        true
      }
      else -> {
        println("$newValue is not public mood I'm capable of")
        false
      }  // Note: reject value change
    }
  })
}

fun main(args: Array<String>) {

  val birthday = LocalDate.of(1932, 1, 1)
  val goofy = Dog(birthday)

  // (4) Lazy property value is cached
  println(goofy.age)
  println(goofy.age)

  // (5) Observable changes are intercepted
  goofy.status = "Eating"
  goofy.status = "Sleeping"
  goofy.status = "Eating"

  // (6) Vetoable property may not change
  goofy.mood = "Grumpy"
  goofy.mood = "Happy"
  goofy.mood = "Sad"
}