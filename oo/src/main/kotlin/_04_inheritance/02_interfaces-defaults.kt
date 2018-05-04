package _04_inheritance

import _01_basics.Person
import java.io.Serializable

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// Note: interfaces can have properties and default methods
interface Archivable {

  // Note: visibilities later
  val archiveWithTimeStamp: Boolean  // (1) Implicitly abstract

  val maxArchiveSize: Long           // (2) Concrete property with accessor
    get() = -1

  fun archive()                      // (3) Abstract method

  fun print() {                      // (4) Open method with default implementation
    val withOrWithout = if (archiveWithTimeStamp) "with" else "without"
    val max = if (maxArchiveSize == -1L) "∞" else "$maxArchiveSize"
    println("Archiving $withOrWithout time stamp")
    println("Archiving up to $max entries")
  }
}

// (5) Can implement any number of interfaces
class Task(val title: String, val assignee: Person) : Archivable, Serializable {

  // (6) Overriding property = overriding accessors (here get() in shorthand)
  override val archiveWithTimeStamp = true

  override fun archive() {
    // ...
    println("Archived task: $title")
  }

  // (7) Can override non-abstract methods too
  override fun print() {
    super.print()  // (8) Access parent implementation
    println("Archiving task objects")
  }
}

fun main(args: Array<String>) {

  val assignee = Person("Jessica", 50)
  val learn = Task("Master programming with Kotlin", assignee)

  learn.archive()
  learn.print()
}