package _03_scoping

import java.util.*

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val builder = StringBuilder()

  // (1a) Perform many calls on same object
  val essay = with(builder) {
    appendln("Beginning")
    appendln("Middle")
    appendln("End")
    trim()
    toString()
  }
  println(essay)

  // (1b) Builder still in scope
  builder.append("Whoops")

  // (2b) Better: use again to reduce scope when possible
  val essay2 = with(StringBuilder()) {  // Note: string builder only accessible inside lambda
    appendln("Intro")
    appendln("Content")
    appendln("Conclusion")
    trim()
    toString()
  }
  println(essay2)

  // (3) To access extensions from outside ("get a glimpse into the class")
  val random = Random()

  with(AuthTools()) {
    val password = random.generatePassword(12)
    println(password)
  }

  // (3b) Not accessible from outside (because extension)
//  val password = random.generatePassword(12)
}

class AuthTools {
  fun Random.generatePassword(length: Int) = String(ints(32, 124)
      .limit(length.toLong())
      .toArray()
      .map { it.toChar() }
      .toCharArray())
}