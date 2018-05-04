package _02_collections

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Folding with 0 and + => sum
fun sum(numbers: Array<Int>) = numbers.fold(0, { acc, i -> acc + i })

// (2) Folding with 1 and * => product
fun product(numbers: Array<Int>) = numbers.fold(1, { acc, i -> acc * i })

// (3) Folding with [] and append => list concatenation
// Note: generics explained later
fun <T> flatten(lists: List<List<T>>) = lists.fold(listOf<T>(), { acc, list -> acc + list })

fun main(args: Array<String>) {

  // (1) (2)
  val numbers = arrayOf(4, 8, 15, 16, 23, 42)
  println(sum(numbers))
  println(product(numbers))

  // (3)
  val listOfLists = listOf(
      listOf(0, 1, 1, 2, 3, 5, 8, 13),
      listOf(1, 11, 21, 1211, 111221)
  )
  println(flatten(listOfLists))

  // Note: there are also foldRight, foldIndexed, foldRightIndexed
  // Left/right the same if operation is commutative (as above)
}