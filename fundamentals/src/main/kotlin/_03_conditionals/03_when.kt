package _03_conditionals

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val level = "intermediate"

  // Basically simplified if-statement in this case
  when (level) {
    "beginner" -> println("Suitable for beginners")
    "intermediate" -> println("You should have some experience")
    "advanced" -> println("Take your skills to the next level")
  }
}