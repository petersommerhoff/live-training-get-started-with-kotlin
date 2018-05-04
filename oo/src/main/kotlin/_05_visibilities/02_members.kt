package _05_visibilities

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

open class Parent {

  // (1) public (default): accessible anywhere the containing class is accessible
  // Note: for well-defined interface
  val public = "public"

  // (2) internal: accessible anywhere in same module where containing class is accessible
  internal val internal = "internal"

  // (3) protected: accessible inside containing class and children
  // Note: only for open/abstract classes
  protected val protected = "protected"

  // (4) private: accessible only inside containing class
  // Note: prefer private, information hiding
  private val private = "private"

  // (5) Inner classes can access everything from containing class (using "inner" modifier)
  inner class Inner {
    val accessible = "$public, $internal, $protected, $private"
  }

  // (6) Nested class (without "inner") must create reference explicitly
  class Nested {
    val p = Parent()
    val accessible = "${p.public}, ${p.internal}, ${p.protected}, ${p.private}"
  }
}

// (6) Child classes cannot access private members
class Child : Parent() {
  val accessible = "$public, $internal, $protected"
}

// (7) Unrelated class cannot access private or protected members
class Unrelated {
  val p = Parent()
  val accessible = "${p.public}, ${p.internal}"
}


fun main(args: Array<String>) {

  val parent = Parent()
  val inner = Parent().Inner()  // (8) Requires object of outer class
  val nested = Parent.Nested()  // (9) Creates object itself (no constructor call on Parent)
  val child = Child()
  val unrelated = Unrelated()

}