package lab

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// Using scope to prevent clashes while solving task in exercise01.kt
fun scope() {
  fun requireThat(condition: Boolean, message: () -> String) {
    if (!condition) throw IllegalArgumentException(message())
  }
}
