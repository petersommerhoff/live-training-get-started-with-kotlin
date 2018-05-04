package _02_properties

import _01_basics.Person

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Immutable and non-null => must initialize correctly at declaration-site
//val nonNull: Person = null

// (2) Not always feasible (in Java often isInitialized with null): e.g. DI or unit tests
class SomeUnitTest {

  // (3) lateinit modifier allows delaying initialization
  // Note: prevents nullable type; only use when initialization is guaranteed
  lateinit var person: Person

  @BeforeEach
  fun setup() {
    person = Person("John Doe", 42)
  }

  fun test() {
    // assertions...
    println(person)
  }
}

class InjectedDependencies {

  // (4) Again avoiding nullable type
  @Inject lateinit var person: Person

  fun foo() {
    val name = person.name
  }
}

fun main(args: Array<String>) {
  val test = SomeUnitTest()
  test.test()
}

// Note: restrictions of lateinit
// - properties inside class, not primary constructor (isInitialized anyway)
// - no custom getter or setter (compiler cannot validate initialization)
// - nonnull property (otherwise useless)
// - not for mapped primitive types (Int, Double etc)







annotation class Inject
annotation class BeforeEach