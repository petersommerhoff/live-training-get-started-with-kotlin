package _02_collections

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // (1) Filtering collections
  val names = listOf("Susan", "", "Julia", "  ", " ", "John")
  val valid = names.filter { it.isNotBlank() }
  println(valid)

  // (2) Filtering strings
  val normal = "The early bird catches the worm."
  val onlyConsonants = normal.filter { it.toLowerCase() !in listOf('a', 'e', 'i', 'o', 'u') }
  println(onlyConsonants)

  // (3) Filter with index
  val attendees = listOf("Susan", "John", "Katrina", "Julia", "Marc")
  val group1 = attendees.filterIndexed { index, _ -> index % 2 == 0 }
  val group2 = attendees.filterIndexed { index, _ -> index % 2 == 1 }  // == attendees - group1
  println("Group 1: $group1 | Group 2: $group2")
}