package _01_higherorder

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

fun main(args: Array<String>) {

  // (1) Function from String -> String
  val upperCase: (String) -> String = { str: String -> str.toUpperCase() }  // Note: shorter forms later
  val title = upperCase("sql api")
  println(title)

  // (2) Function from String -> Int (type inference)
  val countBs = { str: String -> str.toLowerCase().count { char -> char == 'b' } }
  println(countBs("Beautiful birds"))

  // (3) Function from Int x Int -> Double
  val divide: (Int, Int) -> Double = { a, b -> a.toDouble() / b.toDouble() }
  println(divide(7, 3))

  // (4) Function without parameters or return type
  val welcome: () -> Unit = { println("Welcome back!") }
  welcome()

  // Note: more advanced
  // (5) Nested function
  val repeat: (Int) -> ((Int) -> Unit) -> (() -> Unit) = { times -> { op -> { repeat(times, op) } } }

  // (6) Curried form
  val repeatCurried: (Int) -> ((Int) -> Unit) -> (() -> Unit) = { times -> { op -> { repeat(times, op) } } }

  // (7) Partial application
  val doTwice = repeatCurried(2)

  doTwice {
    println("Take two!")
  }

}