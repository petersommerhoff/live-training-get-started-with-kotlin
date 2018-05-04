package _08_exceptions

import java.io.File
import java.io.FileNotFoundException

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

fun main(args: Array<String>) {

  // (1) Calling function without exception handling
  println("It's gonna be legen--")
  delay(1000)  // Note: don't have to catch unchecked exception (this one also unchecked in Java)
  println("Wait for it...")
  delay(1000)
  println("--dary!")

  // (2) try-catch blocks
  try {
    delay(-100)
  } catch (iae: IllegalArgumentException) {
    println("Call to delay() failed because of wrong argument: $iae")
  }

  // (3) finally always executed at the end
  // (4) try is an expression
  // (5) Multiple catch blocks
  val contents: String = try {
    File("doesntexist.csv").readText()
  } catch (fnfe: FileNotFoundException) {
    println("Could not find file: $fnfe")
    ""
  } catch (npe: NullPointerException) {
    println("null was passed as file path: $npe")
    ""
  } finally {
    // (6) Not part of return value
    println("Closing open resources...")
  }
}