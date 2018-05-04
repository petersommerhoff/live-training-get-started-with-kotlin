package _07_checks

import java.time.LocalDate
import java.time.chrono.ChronoLocalDate

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // (1) Nullable variable
  val date: ChronoLocalDate? = LocalDate.now()

  if (date != null) {
    println(date.isLeapYear)  // (2) Smart-cast to non-nullable (direct access)
  }

  if (date != null && date.isLeapYear) {  // (3) Smart-cast inside condition ("short-circuiting")
    println("It's a leap year!")
  }

  if (date == null || !date.isLeapYear) {  // (4) Smart-cast inside condition
    println("There's no Feb 29 this year...")
  }

  if (date is LocalDate) {
    val month = date.monthValue  // (5) Smart-cast to subtype LocalDate
  }

  // Note: in short, you can automatically use variables as desired most of the time
}