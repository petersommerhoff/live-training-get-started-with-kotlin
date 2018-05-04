package _06_classes

import _01_basics.Person

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Cannot inherit from a data class
//open data class Foo(val a: Int)
//abstract data class Foo(val a: Int)

// (2) Data classes can inherit from others
// (2a) Would override open equals(), hashCode(), toString()
// (2b) Would skip generation if final equals(), hashCode(), toString() in parent
// (2c) Parent may have _open_ componentN with matching return type (get overridden)
// (2d) Parent must not have copy() with same signature
open class Message(open val text: String)
data class Email(override val text: String, val sender: Person, val recipient: Person) : Message(text) {

  fun send() {
    // ...
  }
}

