package _04_loops

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // 1) For-loops apply to anything that has an iterator() method

  // 2) String provides an Iterable<Char>
  val word = "Kotlin"
  for (letter in word) {
    println("Give me a ${letter.toUpperCase()}!")  // Note: string interpolation with ${...}
  }
  println("That makes ${word.toUpperCase()}!")

  // 3) Already seen: ranges. There's also CharRange
  for (char in 'a'..'z') {
    print("$char ")
  }

  // 4) Already seen: collections (maps). Every collection works.
  val brothers = listOf("Sam", "Dean")
  for (brother in brothers) {
    println("$brother is one of the brothers.")
  }
}