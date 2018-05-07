package assignments

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val degreeToStudents = mapOf(
      "CS" to listOf(Student("Paul", 21), null, Student("Susan", 23)),
      "Law" to listOf(null, null, Student("Michael", -1)),
      "Economics" to listOf(Student("John", 39), Student("Jessica", -1))
  )

  // 1) A list of all students (without any nulls)
  val students: List<Student> = degreeToStudents
      .flatMap { it.value }
      .filter { it != null }
      .map { it!! }
  println(students)

  // 2) The average age of all students
  val averageAgeAll = students.map { it.age }.filter { it > 0 }.average()
  println(averageAgeAll)

  // 3) The average age of students grouped by degree
  val degreeToAverageAge = degreeToStudents
      .map { it.key to it.value.filter { it != null }
          .map { it!!.age }
          .filter { it > 0 }
          .average() }
  println(degreeToAverageAge)

  // 4) The degrees sorted by number of students ascending
  val degreesSorted = degreeToStudents.map { it.key to it.value.filter { it != null }.count() }
      .sortedBy { it.second }
  println(degreesSorted)
}
