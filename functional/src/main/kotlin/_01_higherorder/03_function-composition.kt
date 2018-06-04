package _01_higherorder

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Composing two functions
fun compose(first: (Int) -> Int, then: (Int) -> Int): (Int) -> Int = { i -> then(first(i)) }

fun main(args: Array<String>) {

  // (2) Using function composition
  val afterExpenses = compose(
      first = { earnings -> earnings - 100 },
      then = { earnings -> (earnings * 0.6).toInt() }
  )

  println("$1000 after expenses: \$${afterExpenses(1000)}")
}