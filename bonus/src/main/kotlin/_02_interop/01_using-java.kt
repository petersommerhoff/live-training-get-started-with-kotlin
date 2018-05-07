package _02_interop

// (1) Import any Java entity as usual
import java.util.*

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

fun main(args: Array<String>) {

  // (2) Use Java classes naturally
  val random = Random().nextInt(10)

  // (3) java.util.ArrayList of kotlin.Int
  val list = ArrayList<Int>()
  list.add(0)

  // (4) Use own Java classes
  val own = OwnJavaClass(100)
  println(own.attribute)

  // (4a) Attribute with only getter becomes a val
//  own.attribute = 9000
}