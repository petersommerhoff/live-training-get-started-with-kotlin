package _07_objects

import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JButton
import kotlin.math.PI

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

fun areaOfEllipse(vertex: Double, covertex: Double): Double {

  // (1) Ad-hoc object (may also contain methods)
  val ellipse = object {
    val x = vertex
    val y = covertex
  }
  return PI * ellipse.x * ellipse.y
}

fun init(button: JButton) {

  // (2) Object expressions can inherit from classes and interfaces
  button.addActionListener(object: ActionListener {
    override fun actionPerformed(e: ActionEvent?) {
      println("Button was clicked!")
    }
  })

  // (3) Idiomatic code for SAM interfaces
  button.addActionListener { println("Here's another action to happen!") }

}

fun main(args: Array<String>) {

  val area = areaOfEllipse(1.23, 4.56)
  println(area)

  val button = JButton()
  init(button)
  button.doClick()

}