package _06_classes

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Simple enum
// Note: for finite amount of distinct values
enum class ProcessStatus {
  IDLE, RUNNING, COMPLETED
}

// (2) Enum with property
enum class Direction(val degrees: Double) {
  NORTH(0.0), EAST(90.0), SOUTH(180.0), WEST(270.0);

  // (3) Can have methods (separated from instances by semicolon!)
  fun describe() = when (this) {
    NORTH -> println("Going into the northern cold")
    EAST -> println("Visiting eastern cultures")
    SOUTH -> println("Going for holidays in the sunny south")
    WEST -> println("Exploring western countries")
  }
}

fun main(args: Array<String>) {

  val status = ProcessStatus.COMPLETED

  // (4) Exhaustive when-statement (and compiler knows)
  val message = when (status) {
    ProcessStatus.IDLE -> "Process is waiting for CPU time"
    ProcessStatus.RUNNING -> "Process is running"
    ProcessStatus.COMPLETED -> "Process has finished"
  }
  println(message)

  // (5) Call methods as usual
  val towardsHolidays = Direction.SOUTH
  towardsHolidays.describe()
  println(towardsHolidays.degrees)

  // (6) Kotlin generates some helpers
  val east = Direction.valueOf("EAST")
  println(east.name)
  println(east.ordinal)
  println(Direction.values().joinToString())
}

