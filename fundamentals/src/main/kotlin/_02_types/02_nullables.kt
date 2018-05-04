package _02_types

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val nonNull: String = "Holy Moly!"
  println(nonNull.length)
//  val str2: String = null

  var maybeNull: String? = null
  println(maybeNull?.length)

  maybeNull = "Holy Mary!"
  println(maybeNull.length)  // Smart-cast (possible because local variable)
}