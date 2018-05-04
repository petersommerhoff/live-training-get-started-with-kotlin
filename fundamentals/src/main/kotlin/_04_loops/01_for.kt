package _04_loops

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val personToRole = mapOf(
      "Homer" to "father",
      "Marge" to "mother",
      "Bart" to "son",
      "Lisa" to "daughter",
      "Maggie" to "baby"
  )

  // 1) For-loop is a little different, no ";; syntax"

  for (entry in personToRole) {
    val name = entry.key
    val role = entry.value
    println("$name is the $role in The Simpsons")
  }

  println("-----")

  // 2) Better solution to iterate over maps
  for ((name, role) in personToRole) {
    println("$name is the $role in The Simpsons")
  }
}