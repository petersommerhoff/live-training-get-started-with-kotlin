package _03_scoping

import java.awt.Container
import java.awt.Dimension
import java.awt.Font

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // (1) Set up an object
  val container = Container().apply {
    size = Dimension(1024, 800)
    font = Font.decode("Arial-bold-22")
    isVisible = true
  }

  // (2) Builder-style setters for fluent API
  // Note: excursus, classes explained later
  class MyFont(var name: String = "Arial", var size: Int = 12) {
    fun withName(name: String) = apply { this.name = name }
    fun withSize(size: Int) = apply { this.size = size }
  }

  val font = MyFont().withName("Verdana").withSize(18)

  // (3) Generally, to make changes to an object and return the result
}