package _03_scoping

import _02_collections.User
import java.util.logging.Level
import java.util.logging.Logger

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  val debug = Logger.getLogger("debug")

  // (1) For unrelated actions that don't use the context object
  val admin = User("admin", 33, true).also {
    debug.log(Level.INFO, "Created admin user")  // Note: user isn't accessed (otherwise apply)
  }

  // (2) For validation before assignment (block is executed before assignment)
  val guest: User = admin.also {
    require(it.username != "admin")
    debug.log(Level.INFO, "Guest is valid")
  }

  // Note: returns the context object like `apply`
}