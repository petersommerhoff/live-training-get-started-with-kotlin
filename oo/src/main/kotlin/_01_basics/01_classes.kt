package _01_basics

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Empty class => no curly braces even necessary
class Blank

// (2) Class with members
class Repository {

  // (2a) Property
  val url: String = "http://github.com/petersommerhoff/kotlin-live-training"

  // (2b) Method
  fun printUrl() {
    println(url)
  }
}

fun main(args: Array<String>) {

  // Object initialization (calls constructor)
  val blank = Blank()
}