package _03_scoping

import _02_collections.User

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
fun main(args: Array<String>) {

  // (1) Immediately applied functions / scoped blocks of codes
  run {
    println("Do whatever you want")
    val a = 11 * 13
  }

  // (2) Compute value while scoping local variables
  val success = run {
    println("Enter username:")
    val username = readLine()
    println("Enter password:")
    val password = readLine()

    validate(username, password)
  }
  val message = if (success) "You're logged in" else "Please try again"
  println(message)

  // (3) Turn explicit parameter into receiver object
  fun welcomeUser(user: User) = user.run {
    val premium = if (paid) " (Premium)" else ""
    val displayName = "$username$premium"
    println(displayName)
  }

  welcomeUser(User("elon", 46, true))
}

fun validate(username: String?, password: String?): Boolean {
  if (username == null || password == null) return false

  return true
}
