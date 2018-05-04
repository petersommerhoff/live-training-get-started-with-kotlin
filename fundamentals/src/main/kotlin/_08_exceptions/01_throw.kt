package _08_exceptions

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

fun delay(milliseconds: Long) {
  if (milliseconds < 0) {
    throw IllegalArgumentException("delay() expects a non-negative number of milliseconds.")
  }
  Thread.sleep(milliseconds)
}