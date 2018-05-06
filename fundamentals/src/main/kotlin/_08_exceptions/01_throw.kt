package _08_exceptions

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) throw works same way as in Java (without new keyword of course)
fun delay(milliseconds: Long) {
  if (milliseconds < 0) throw IllegalArgumentException("delay() expects a non-negative number of milliseconds.")
  Thread.sleep(milliseconds)
}