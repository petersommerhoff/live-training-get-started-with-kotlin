package _04_inheritance

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Interface defines capability
interface Kickable {
  fun kick()
}

// (2) There's some implementation available
class BaseKickHandler : Kickable {
  override fun kick() {
    println("Got kicked")
  }
}

// (3) Class can implement interface by delegation (zero boilerplate)
// Note: compiler generates all methods from Kickable and delegation code
class Football(kickHandler: Kickable) : Kickable by kickHandler

fun main(args: Array<String>) {

  val kickHandler = BaseKickHandler()
  val ball = Football(kickHandler)

  // (4) Delegates to kickHandler.kick()
  ball.kick()
}
