package _08_lab

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// Using prefixes to avoid clashes while solving task in exercise02.kt
fun <T> myRequireNotNull(t: T?) = t ?: throw IllegalArgumentException("$t must not be null.")

sealed class MyGenericResult
data class MyGenericSuccess<T>(val value: T) : MyGenericResult()
data class MyGenericFailure(val reason: Exception) : MyGenericResult()

sealed class MyGenericBinaryTree<T>
data class MyGenericLeaf<T>(val value: T) : MyGenericBinaryTree<T>()
data class MyGenericBranch<T>(val left: MyGenericBinaryTree<T>, val right: MyGenericBinaryTree<T>) : MyGenericBinaryTree<T>()


fun main(args: Array<String>) {

  val nullable: String? = "Hello World"
  val notNull: String = myRequireNotNull(nullable)

  val response: MyGenericResult = MyGenericFailure(IllegalArgumentException("Expected user id"))
  println(response)

  val tree = MyGenericBranch(
      MyGenericBranch(
          MyGenericLeaf(17),
          MyGenericBranch(
              MyGenericLeaf(3),
              MyGenericLeaf(8)
          )
      ),
      MyGenericLeaf(11)
  )
  println(tree)
}