package _02_types

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // (1) Read-only maps
  val studentToGrade = mapOf(
      "Susan" to 3.8,
      "Marc" to 3.3,
      "Katrina" to 4.0
  )
  println(studentToGrade)

  // (2) Mutable maps
  val owners = mutableMapOf(
      "Ferrari" to "Susan",
      "Porsche" to "Marc"
  )
  println(owners)

  owners.put("Tesla", "Katrina")
  owners.putIfAbsent("Tesla", "Marc")
  println(owners)

  owners.remove("Ferrari")
  println(owners)

  owners.replace("Porsche", "Katrina")
  println(owners)
}