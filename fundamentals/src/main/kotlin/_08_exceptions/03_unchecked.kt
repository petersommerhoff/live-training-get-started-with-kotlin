@file:JvmName("Unchecked")

package _08_exceptions

import java.lang.StringBuilder

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Exception is checked in Java
//@Throws(Exception::class)  // (3) For Java interop
fun require(condition: Boolean, message: String) {
  if (!condition) throw Exception(message)
}

fun main(args: Array<String>) {

  // (2) In Kotlin, all exceptions are unchecked
//  require(2 == 3, "mathematics.exe stopped working")

  // (4) Java's Appendable.append() throws IOException (implemented by StringBuilder)
  val html: Appendable = StringBuilder()
  html.append("<html>")
  html.append("</html>")
  println(html)
}