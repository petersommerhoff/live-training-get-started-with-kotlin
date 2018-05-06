package _06_lab

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// Added `My` as prefix to prevent clashes while solving task in exercise01.kt
interface MyDrinkable {
  fun drink()
  val calories: Int
}

abstract class MyBeverage(override val calories: Int) : MyDrinkable {
  override fun drink() {
    println("Drinking beverage...")
  }
}

open class MyJuice(val hasPulp: Boolean) : MyBeverage(43)

class MySoftdrink : MyBeverage(39)