package _02_types

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // (1) Non-nullable variable
  val nonNull: String = "Holy Moly!"
  println(nonNull.length)
//  val str2: String = null

  // (2) Nullability is always explicit
  var maybeNull: String? = null
  println(maybeNull?.length)

  // Note: smart-cast (possible because local variable)
  maybeNull = "Holy Mary!"
  println(maybeNull.length)
}