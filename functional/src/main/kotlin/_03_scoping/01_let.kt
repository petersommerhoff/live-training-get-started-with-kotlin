package _03_scoping

import java.io.File

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val personToHobby = mapOf(
      "Sarah" to "Playing badminton",
      "Andy" to "Playing the drums",
      "Mike" to "Singing karaoke"
  )

  // (1) Handling nullables
  // Note: notice question mark before let
  personToHobby["Mike"]?.let {
    println("Hobby: $it")
  }

  personToHobby["Peter"]?.let {
    println("Hobby: $it")
  }

  // (2) Convering nullable to another nullable
  val words = personToHobby["Sarah"]?.let {
    getWords(it)
  }

  // (3a) Scoping a variable
  val path = "functional/src/main/kotlin/_02_collections/Entities.kt"
  File(path).bufferedReader().let { reader ->
    reader.forEachLine { println(it) }  // Note: reader only accessible inside the lambda
  }

  // (3b) Buffered reader no longer in scope
}

fun getWords(str: String) = str.split(" ")
