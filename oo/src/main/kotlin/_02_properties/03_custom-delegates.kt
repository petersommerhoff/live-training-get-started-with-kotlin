package _02_properties

import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

// (1) Delegates simply need getValue() (and setValue() for var)
// Note: Dog is type of class containing property, String is type of property (generics later)
class MyDelegate : ReadWriteProperty<Cat, String> {  // Note: read-write for val
  var name: String = "Puss in Boots"

  // (2) getValue() acts as getter
  override fun getValue(thisRef: Cat, property: KProperty<*>): String {
    println("$thisRef accessed value of ${property.name}")
    return name
  }

  // (3) setValue() acts as setter
  override fun setValue(thisRef: Cat, property: KProperty<*>, value: String) {
    println("$thisRef set value of ${property.name} to $value")

    if (value.isNotBlank()) {
      name = value
    }
  }
}

class Cat {
  // (4) Cat class can use delegate for String property
  var name by MyDelegate()
}

fun main(args: Array<String>) {

  val cat = Cat()
  println(cat.name)  // Calls MyDelegate.getValue()
  cat.name = "puss in boots"  // Calls MyDelegate.setValue()
  println(cat.name)  // Calls MyDelegate.getValue()
}