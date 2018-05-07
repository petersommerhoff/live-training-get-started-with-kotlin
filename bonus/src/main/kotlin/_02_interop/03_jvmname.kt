@file:JvmName("DateUtils")

package _02_interop

import java.time.Instant
import java.util.*

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

data class DateRange(val from: Date, val to: Date)

@JvmName("period")
infix fun Date.until(other: Date) = DateRange(this, other)

val Date.instant
  get() = Instant.ofEpochMilli(this.time)