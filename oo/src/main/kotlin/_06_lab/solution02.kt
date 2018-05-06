package _06_lab

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// Added `My` as prefix to prevent clashes while solving task in exercise01.kt
enum class MyNetworkStatus(val maxDownloadInKbit: Int) {
  Status4G(100_000), StatusH(7200), Status3G(384_000),
  StatusE(217), Status2G(14)
}

data class MySong(val title: String, val band: String, val year: Int, val durationInSeconds: Int)

sealed class MyResult
data class MySuccess(val value: Int) : MyResult()
data class MyFailure(val reason: Exception) : MyResult()

fun main(args: Array<String>) {

  val network = MyNetworkStatus.Status4G
  println(network.maxDownloadInKbit)

  val song = MySong("Through the Fire and Flames", "Dragonforce", 2005, 442)
  println(song)

  val response1: MyResult = MySuccess(42)
  val response2: MyResult = MyFailure(NoSuchElementException("User with id 42 doesn't exist."))
  println(response1)
  println(response2)
}