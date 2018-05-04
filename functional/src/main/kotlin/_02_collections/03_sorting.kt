package _02_collections

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

fun main(args: Array<String>) {

  val developers = listOf(
      Employee("Josh Bloch", 200_000),
      Employee("Venkat Subramaniam", 150_000),
      Employee("Martin Fowler", 175_000)
  )

  val byName = developers.sortedBy { it.name }
  val bySalary = developers.sortedBy { it.yearlySalary }
  val bySalaryDesc = developers.sortedByDescending { it.yearlySalary }

  println(byName)
  println(bySalary)
  println(bySalaryDesc)
}