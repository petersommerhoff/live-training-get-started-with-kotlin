package _03_constructors

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Again, Java-style with lots of boilerplate
// Note: perform suggested refactorings
class House(floors: Int, numRooms: Int) {  // (2) Just parameters, so where to write initialization logic?
  val floors: Int
  val numRooms: Int

  // (3) init-block for initialization logic
  init {
    this.floors = floors
    this.numRooms = numRooms
  }
}

// (4) Modifiers on primary constructor
// Note: also for annotations
// Note: idiomatic primary constructor (no custom getter/setter)
class Monument private constructor(val height: Int)