package _02_collections

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // (1) Basic mapping: modify each element
  val books = setOf("Kotlin for Android App Development", "Design Patterns", "Effective Java")
  println(books.map { it.toUpperCase() })  // Sidenote: returns List<String>

  // (2b) Mapping list to map
  val todos = listOf("Give talk", "Prepare live training", "Write book")
  val indexedTodos = todos.toIndexedMap()
  println(indexedTodos)

  // (3) Mapping objects to specific attributes (projection)
  val users = listOf(
      User("johnnyboy", 19, false),
      User("susy", 35, true),
      User("katyyy", 42, true)
  )
  val usernames = users.map { it.username }
  println(usernames)

}

// (2a) Transforming list to map using `mapIndexed`
fun List<String>.toIndexedMap(): Map<Int, String> {
  val pairs = this.mapIndexed { index, element -> index to element }.toTypedArray()
  return mapOf(*pairs)
}