package _03_lab

import kotlin.properties.Delegates.observable

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
class Student {

  var name: String = "Lizzy Lazy"
    get() = "Hey, my name's $field"
    set(value) {
      if (value.contains(" ")) field = value
    }

  val homework: String by lazy {
    println("There's no way around it. Doing my homework...")
    Thread.sleep(1000)
    "A victory is twice itself when the achiever brings\n" +
        "home full numbers. I find here that Don Peter hath\n" +
        "bestowed much honour on a young Florentine called Claudio."
  }

  var outfit: String by observable("Jeans & shirt", { property, old, new ->
    println("Now I'm wearing $new")
  })

  fun dressNormally() {
    outfit = "Jeans & shirt"
  }

  fun dressFormally() {
    outfit = "Black & white"
  }
}

fun main(args: Array<String>) {

  val lizzy = Student()
  lizzy.dressFormally()
  lizzy.dressNormally()

  lizzy.name = "Liz"
  println(lizzy.name)

  println(lizzy.homework)
  println(lizzy.homework)
}