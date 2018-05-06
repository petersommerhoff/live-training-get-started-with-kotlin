package _08_generics

import _08_generics.Suit.*

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Generic class encapsulates generic logic for any type T
class MutableStack<T>(vararg initialElements: T) {

  // (2) Accordingly, need backing List<T>
  val elements = mutableListOf<T>(*initialElements)

  fun push(element: T) { elements.add(element) }
  fun pop() = elements.removeLast()
  fun isEmpty() = elements.isEmpty()
  override fun toString() = "Stack[${elements.joinToString()}]"

  // Note: private helper extension
  private fun <T> MutableList<T>.removeLast() = this.removeAt(lastIndex)
}

// (3) Generic function
// Note: remember spread operator
fun <T> mutableStackOf(vararg elements: T) = MutableStack<T>(*elements)

fun main(args: Array<String>) {

  // (4) Compiler infers MutableStack<Card>
  val deck = MutableStack(Card(11, SPADES), Card(7, CLUBS))
  val card = deck.pop()
  println(card)
  deck.push(Card(8, DIAMONDS))
  println(deck)

  // (5) Compiler infers mutableStackOf<Book>
  val readingList = mutableStackOf(Book("The Power of Habit"), Book("On Writing Well"))
  val next = readingList.pop()
  println(next)
  println(readingList)
}

// Note: recap of enum and data classes
enum class Suit {
  DIAMONDS, CLUBS, HEARTS, SPADES
}
data class Card(val value: Int, val suit: Suit)
data class Book(val title: String)