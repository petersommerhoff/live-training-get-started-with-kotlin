package _03_scoping

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val authorToBooks = mutableMapOf(
      "Joshua Bloch" to listOf("Effective Java", "Java Puzzlers"),
      "Robert C. Martin" to listOf("Clean Code", "Agile Software Development")
  )

  // (1) Nesting (use this judiciously, explicitly name lambda parameters)
  authorToBooks["Joshua Bloch"]?.let { books ->
    books.firstOrNull()?.let { book ->
      val keywords = book.split(" ").also {
        println("Gathered keywords for $book")
      }
      println(keywords)
    }
  }

  // (2) Chaining (usually very readable)
  val sql = SqlBuilder().apply {
    append("INSERT INTO user (username, age, paid) VALUES (?, ?, ?)")
    bind("petersommerhoff")
    bind(25)
    bind(true)
  }.also {
    println("Initialized SQL query: $it")
  }.run {
    DbConnection().execute(this)
  }

  // (3) Combine with other higher-order functions
  val authors = authorToBooks.apply {
    putIfAbsent("Martin Fowler", listOf("Patterns of Enterprise Application Architecture"))
  }.also {
    println("Added Martin Fowler to the map")
  }.filter {
    it.value.size > 0
  }.map {
    it.key
  }

  println(authors)
}





class SqlBuilder : Appendable by StringBuilder() {
  fun bind(value: Any) {}
}

class DbConnection() {
  fun execute(query: SqlBuilder) {}
}