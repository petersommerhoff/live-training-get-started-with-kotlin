package _08_lab

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// 1) properties for width and height, accepted by the _private_ primary constructor
// 2) factory methods fromPair(Pair) and fromString(String) that can be called directly as in Rectangle.fromPair(...)
// 2a) the string should have the form "4.0 16.0" with two doubles separated by a space
class Rectangle private constructor(val width: Double, val height: Double) {

  companion object {
    fun fromPair(pair: Pair<Double, Double>) = Rectangle(pair.first, pair.second)
    fun fromString(str: String): Rectangle {
      val widthAndHeight = str.split(" ").map { it.toDouble() }
      require(widthAndHeight.size == 2, { "Please provide a string of the form '10.0 4.54'" })
      return Rectangle(widthAndHeight[0], widthAndHeight[1])
    }
  }

  override fun toString() = "Rectangle(width=$width, height=$height)"
}

fun main(args: Array<String>) {

  val unitSquare = Rectangle.fromPair(1.0 to 1.0)
  println(unitSquare)

  val stretched = Rectangle.fromString("42 1")
  println(stretched)

  val invalid = Rectangle.fromString("2;3")
  println(invalid)
}