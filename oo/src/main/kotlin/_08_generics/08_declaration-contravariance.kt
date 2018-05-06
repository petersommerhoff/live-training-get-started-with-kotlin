package _08_generics

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Generic type parameter with `in` modifier declares Repair<T> as contravariant w.r.t. T
interface Repair<in T> {

  // (2) T can only appear in in-position
  fun repair(t: T)
}

open class Vehicle
class Car : Vehicle()

// (3) Implementation for supertype Vehicle
class VehicleShop : Repair<Vehicle> {
  override fun repair(t: Vehicle) {
    println("Repairing vehicle...")
  }
}

fun main(args: Array<String>) {

  // (4) Contravariance => Repair<Vehicle> subtype of Repair<Car>
  val autoRepair: Repair<Car> = VehicleShop()
  autoRepair.repair(Car())
}

// Note: for use in 05_contravariance
interface PartialOrder<in T> {
  fun lessThanOrEqual(t1: T, t2: T): Boolean
}