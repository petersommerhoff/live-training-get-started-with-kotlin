package _05_functions

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  var localVariable = 0

  // 1) Can define functions inside functions; can access closure (local variable of parent scope)
  fun local() {
    localVariable++
  }

  // 2) Local functions must be defined before use
  local()

  // Note: useful for local helper functions with minimal scope
}