package lab

import java.time.LocalDate

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// Using scope to prevent clashes while solving task in exercise02.kt
fun scope() {
  operator fun LocalDate.rangeTo(other: LocalDate) = DateRange(this, other)
  operator fun DateRange.contains(date: LocalDate) = this.start <= date && date <= this.end
}