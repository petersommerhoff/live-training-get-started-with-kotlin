package assignments

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// Exercise: given the map below, compute the following values (explore additional helpful higher-order functions):
// 1) A list of all students (without any nulls)
// - tip: read the docs about flatMap {}
// 2) The average age of all students (ignore invalid data indicated by age == -1
// 3) The average age of students per degree (again ignore invalid ages)
// - it's okay to compute NaN if no valid data is available
// 4) The degrees sorted by number of students ascending

fun main(args: Array<String>) {

  val degreeToStudents = mapOf(
      "CS" to listOf(Student("Paul", 21), null, Student("Susan", 23)),
      "Law" to listOf(null, null, Student("Michael", -1)),
      "Economics" to listOf(Student("John", 39), Student("Jessica", -1))
  )

  // Insert code here...
}





// Helper class (OO later)
data class Student(val name: String, val age: Int)