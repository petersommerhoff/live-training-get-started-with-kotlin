package _07_objects

import _01_basics.Person

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Singleton object (lazy init, thread-safe, serializable)
object PersonCache {

  private val persons = mutableMapOf<Int, Person>()

  fun cache(id: Int, person: Person): Boolean {
    if (persons.containsKey(id)) return false

    persons.put(id, person)
    return true
  }

  fun getOrNull(id: Int): Person? = persons[id]
}

fun main(args: Array<String>) {

  val lead = Person("Andrey Breslav", 30)

  // (2) Accessed directly by name; methods like static methods in Java
  PersonCache.cache(1, lead)

  val andrey = PersonCache.getOrNull(1)
  val none = PersonCache.getOrNull(2)

  println(andrey?.name)
  println(none?.name)
}