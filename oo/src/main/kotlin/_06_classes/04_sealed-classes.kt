package _06_classes

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Sealed classes allow children only in same file (restricted/fixed hierarchies)
// Note: generalization of enums that allows object creation
sealed class BinaryTree
data class Leaf(val value: Int) : BinaryTree()
data class Branch(val left: BinaryTree, val right: BinaryTree) : BinaryTree()

// (2) Compiler can infer exhaustive when-statements
fun sumOf(tree: BinaryTree): Int = when (tree) {
  is Branch -> sumOf(tree.left) + sumOf(tree.right)
  is Leaf -> tree.value
}

// (3) Either type (generics later)
sealed class Either<L, R> {
  data class Left<L>(val left: L) : Either<L, Nothing>()
  data class Right<R>(val right: R) : Either<Nothing, R>()
}

fun main(args: Array<String>) {

  // (4) Used as always
  val tree = Branch(
      Leaf(1),
      Branch(
          Leaf(2),
          Leaf(3)
      )
  )

  println(sumOf(tree))

  // (5) Either typically used for result vs exception
  val value = Either.Left("Here's the value")
  val exception = Either.Right(IllegalStateException("Cannot access this now"))
}