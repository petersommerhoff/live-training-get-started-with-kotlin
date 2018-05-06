package _03_conditionals

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  print("Do you like Kotlin so far [y/n]? ")
  val like = readLine()

  // (1) if-else statement
  if (like == "y") {
    println("Awesome, me too! :)")
  } else {
    println("Wait till you learn more! ;)")
  }
}