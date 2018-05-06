package _03_conditionals

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val mood = "PRODUCTIVE"  // Note: enum class later

  // (1) RHS can be a block
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