package _02_types

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // 1) Read-only sets
  val students = setOf("Susan", "Marc", "Katrina")  // No order => No index-based access
//  students.add()
  println(students)

  // 2) Mutable sets
  val cuisines = mutableSetOf("Chinese", "Italian", "Mexican")
  println(cuisines)

  cuisines.add("French")
  cuisines.remove("Italian")
  println(cuisines)
}