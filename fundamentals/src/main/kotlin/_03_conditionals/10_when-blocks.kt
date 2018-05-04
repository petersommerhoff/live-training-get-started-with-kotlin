package _03_conditionals

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val mood = "PRODUCTIVE"  // Better: enum class

  when (mood) {
    "PRODUCTIVE" -> {
      println("Work work work...")
      println("Write Kotlin code...")
    }
    "LAZY" -> {
      println("Meh...")
      println("Let's go to bed...")
    }
  }
}