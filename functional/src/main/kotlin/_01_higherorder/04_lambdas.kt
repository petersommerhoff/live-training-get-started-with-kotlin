package _01_higherorder

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

fun main(args: Array<String>) {

  // (1) Function as before, fully explicit types
  val upperCase1: (String) -> String = { str: String -> str.toUpperCase() }

  // (2) Type inference inside lambda
  val upperCase2: (String) -> String = { str -> str.toUpperCase() }

  // (3) Type inference for variable
  val upperCase3 = { str: String -> str.toUpperCase() }

  // (4) Both together not possible
//  val upperCase4 = { str -> str.toUpperCase() }

  // (5) Implicit `it` parameter (especially useful when passing lambda parameters because inference usually possible)
  val upperCase5: (String) -> String = { it.toUpperCase() }

  // (6) Function pointers
  val upperCase6: (String) -> String = String::toUpperCase

  // (7) More idiomatic `countBs`
  val countBs: (String) -> Int = { it.toLowerCase().count { it == 'b' } }  // Sidenote: `it` refers to different things

  // (8) More idiomatic `divide`
  val divide = { a: Int, b: Int -> a.toDouble() / b.toDouble() }

  // (9) More idiomatic `welcome`
  val welcome = { println("Welcome back!") }
}