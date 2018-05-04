package _03_constructors

import javafx.geometry.Point2D

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) One primary constructor
class Triangle2D(
    val ax: Double, val ay: Double,
    val bx: Double, val by: Double,
    val cx: Double, val cy: Double
) {

  // (2) Any number of secondary constructors
  // (3) Must all delegate to primary constructor (if exists) => guaranteed that primary is called
  // Note: cannot use val/var on secondary constructor (idea: secondary maps to primary)
  constructor(a: Point2D, b: Point2D, c: Point2D) : this(a.x, a.y, b.x, b.y, c.x, c.y) {
    // additional logic here...
  }

  fun area() {
    // ...
  }
}

fun main(args: Array<String>) {

  val tri1 = Triangle2D(0.0, 0.0, 2.0, 0.0, 1.0, 1.0)

  val tri2 = Triangle2D(
      Point2D(-1.0, -1.0),
      Point2D(1.0, -1.0),
      Point2D(0.0, 1.0))

  println(tri1.bx)
  println(tri2.bx)  // (4) Properties still defined by primary constructor
}