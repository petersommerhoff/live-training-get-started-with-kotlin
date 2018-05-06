package _04_loops

import java.util.*

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // Note: can use Java classes naturally
  val numberToGuess = Random().nextInt(100) + 1

  println("Hey there, I've thought of a number from 1 to 100. Can you guess it?")
  do {
    println("What's your guess?")

    // Note: rare case where !! is okay to use, check readLine() docs
    val currentGuess = readLine()!!.toInt()  // Note: exception handling later

    when {
      currentGuess < numberToGuess -> println("Too low")
      currentGuess > numberToGuess -> println("Too high")
      currentGuess == numberToGuess -> println("Yes, you got it!!! :)")
    }
  } while (currentGuess != numberToGuess)
}