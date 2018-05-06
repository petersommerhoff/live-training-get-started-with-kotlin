package _03_conditionals

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  var balance = 700
  val toWithdraw = 900

  balance -= toWithdraw

  // (1) if is an expression
  val message = if (balance < 0) {
    // Do other stuff...
    "Warning! You're balance is now below zero: $balance"  // Note: string interpolation with $
  } else {
    "New balance: $balance"
  }

  println(message)

}