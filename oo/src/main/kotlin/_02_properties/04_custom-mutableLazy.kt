package _02_properties

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

@Suppress("UNCHECKED_CAST")
/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 *
 * Based on Marcin Moskala's code: https://www.youtube.com/watch?time_continue=1238&v=8QgWSIaa_QU
 */

// Note: advanced at this point but better example for delegates

// (1) Read-write delegate because mutable, accepts initializer
class MutableLazy<T>(val initializer: () -> T) : ReadWriteProperty<Any?, T> {

  // (2) Keeps track of value and initialization
  var value: T? = null
  var isInitialized = false

  override fun getValue(thisRef: Any?, property: KProperty<*>): T {
    synchronized(this) {
      if (!isInitialized) {
        value = initializer()  // (3) Caches value once initialized
        isInitialized = true
      }
      return value as T
    }
  }

  override fun setValue(thisRef: Any?, property: KProperty<*>, value: T) {
    synchronized(this) {
      this.value = value
      isInitialized = true
    }
  }
}

// (4) Convenience function like lazy {...}
fun <T> mutableLazy(initializer: () -> T) = MutableLazy(initializer)

// (5) Usable like predefined delegates
fun main(args: Array<String>) {

  var lazy by mutableLazy {
    println("Computing initial value...")
    3.1415
  }
  println(lazy)  // Note: initializer not even used without these two lines
  println(lazy)  // Note: cached

  lazy = 3.14159
  println(lazy)
}