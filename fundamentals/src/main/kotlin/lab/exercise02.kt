package lab

import java.time.LocalDate

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// Exercise: Creating convenient operators for Java Time (5 min)

// Exercise 1: create a rangeTo() operator on LocalDate that represent the DateRange from this to the given LocalDate
// - remember LocalDate is not your class but with Kotlin you can still extend its API
// - use the supplied DateRange helper class to represent the date range
// (1) Insert code here

// Exercise 2: create a contains() operator on DateRange (imagine it's a third-party class)
// - should return true if a given date is temporally within the range (both ends inclusive)
// (2) Insert code here



// Note: helper class (OO later)
data class DateRange(val start: LocalDate, val end: LocalDate)