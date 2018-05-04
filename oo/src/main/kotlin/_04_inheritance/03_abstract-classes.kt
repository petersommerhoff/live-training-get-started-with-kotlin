package _04_inheritance

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Abstract class one level less abstract than interface
abstract class Prioritized(var priority: Int) {

  abstract fun complete()  // (2) Abstract method: must override (note: now explicit "abstract")

  open fun markAsTrivial() {     // (3) Open method: allows overriding
    priority = 15
  }

  fun markAsBlocker() {         // (4) Closed method: cannot override
    priority = 100
  }

  // Note: final by default!
}

class ToDo(val title: String, priority: Int) : Prioritized(priority), Archivable {
  override val archiveWithTimeStamp = true

  // (5) Required override for interface method
  override fun archive() {
    println("Archived to-do: $title with priority $priority/100")
  }

  // (6) Required override for abstract class method
  override fun complete() {
    println("Completed task: $title")
  }

  // (7) Optional override for abstract class method
  override fun markAsTrivial() {
    priority = 20
  }

  // (8) Cannot override markAsBlocker
//  override fun markAsBlocker() {}
}

fun main(args: Array<String>) {

  val todo = ToDo("Push to GitHub", 60)
  println(todo.priority)

  todo.markAsBlocker()
  println(todo.priority)

  todo.markAsTrivial()
  println(todo.priority)

  todo.complete()
  todo.archive()
}
