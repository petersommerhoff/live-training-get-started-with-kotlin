package lab

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// Exercise: implement a higher-order function requireThat(condition, messageBuilder) which throws an
// IllegalArgumentException if its condition is not fulfilled and where messageBuilder is a function () -> String
// - uncomment the code in main() below for a quick check
// - this is similar to require() from the training but with a lazy message
// Insert code here...

fun main(args: Array<String>) {

  // (1) Should not throw an exception
//  requireThat(1 + 1 != 0, { "We're not living in F_2" })

  // (2) Should throw an exception with the given message
//  requireThat("Java" > "Kotlin", { "Actually, Kotlin is greater than Java" })
}