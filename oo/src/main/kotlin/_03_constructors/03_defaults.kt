package _03_constructors

import _01_basics.Person

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Constructor with default values
class Group(val members: MutableList<Person> = mutableListOf(), val active: Boolean = true) {

  // (2) Secondary constructor offering vararg
  constructor(vararg members: Person) : this(members.toMutableList())
}

fun main(args: Array<String>) {

  // (3) Passing only members (as vararg)
  val studyGroup = Group(
      Person("Cathrin", 23),
      Person("Brian", 25),
      Person("Miguel", 22))

  // (4) Passing only active
  val pendingGroup = Group(active = false)
  pendingGroup.members.add(Person("Patricia", 20))
}