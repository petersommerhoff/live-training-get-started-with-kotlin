package _07_checks

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // (1) Nullable variable
  val date: ChronoLocalDate? = LocalDate.now()

  // (2) Smart-cast to non-nullable (thus allows direct access)
  if (date != null) {
    println(date.isLeapYear)
  }

  // (3) Smart-cast inside condition (enabled by short-circuiting)
  if (date != null && date.isLeapYear) {
    println("It's a leap year!")
  }

  // (4) Smart-cast inside condition (enabled by short-circuiting)
  if (date == null || !date.isLeapYear) {
    println("There's no Feb 29 this year...")
  }

  // (5) Smart-cast to subtype LocalDate
  if (date is LocalDate) {
    val month = date.monthValue
  }

  // Note: in short, you can automatically use variables as desired most of the time
}