package assignments

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// 1) if the `user` object is not null, you want to log them in
/*
user?.let { login(it) }
 */

// 2) you want to create a Button object and initialize its font, color, and size
/*
val button = Button().apply {
  font = Font("Verdana", 14)
  color = Color.BLACK
  width = 100
  height = 40
}
 */

// 3) you have a StringBuilder with which you want to build a string in several steps
/*
with (StringBuilder()) {
  append("Good ")
  append("job ")
  append("working ")
  append("through ")
  append("the ")
  append("exercises!")
}
 */

// 4) you want to immediately run a lambda or create a scope on-demand
/*
run {
  val s = "inside lambda"
  println("s is only visible $s")
}
 */

// 5) you're using a closeable HTTP connection and want to avoid leaks from forgetting to call connection.close()
/*
connection.use {
  val request = it.sendRequest()
  ...
}
*/