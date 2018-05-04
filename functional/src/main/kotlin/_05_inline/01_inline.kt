package _05_inline

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Improved performance for loop
inline fun inlineLoop(times: Int, operation: (Int) -> Unit) {
  for (i in 0 until times) operation(i)
}

fun main(args: Array<String>) {

  // (2) Inlines lambda instead of creating anonymous inner class in bytecode
  // Note: repeat from stdlib is inlined
  inlineLoop(4) { i ->
    println(if (i < 3) "${3 - i}" else "GO!")
    Thread.sleep(1000)
  }

  // (3) Inline function can do non-local returns
  inlineLoop(4) {
    if (it == 2) return
    else println("$it is still okay...")
  }

  // Note: with, apply, also, run, let, use are all inlined (stdlib makes heavy use)
}