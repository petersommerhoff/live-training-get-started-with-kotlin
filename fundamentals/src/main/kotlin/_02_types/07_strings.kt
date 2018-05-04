package _02_types

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // (1) String type as in Java
  val quote = "You only live once, but if you do it right, once is enough."

  // (2) Element access
  println(quote[2])

  // (3) Normal string
  val escapedString = "Live as if you were to die tomorrow.\nLearn as if you were to live forever."
  println(escapedString)

  // (4) Raw string (multiline)
  val rawString = """for (c in "foo")
                    |  print(c)
                    |This is a raw string""".trimMargin()
  println(rawString)

  // (5) String interpolation
  val price = 19.99

  val message = "The price is \$$price"  // Note: printing $ character
  println(message)
  println("The output above has ${message.length} characters.")
}