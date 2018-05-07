package _02_interop

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */

fun main(args: Array<String>) {

  val javaProducer = JavaProducer()

  // (1) Check return type of getString() in autocomplete -> "platform type"
  val str1: String? = javaProducer.string

  // (1a) Unsafe in this case
  // Note: when interoperating like this, Kotlin is only as safe as Java
  val str2: String = javaProducer.string

  // (2) Can only be Int (Java int)
  val int1: Int = javaProducer.int

  // (3) Integer may be null
  val int2: Int? = javaProducer.integer

  // (3a) Unsafe
  val int3: Int = javaProducer.integer

  // (4) List<Integer> may be any of the following:
  // - List<Int>
  // - List<Int?>
  // - List<Int>?
  // - List<Int?>?
  // - MutableList<Int>
  // - MutableList<Int?>
  // - MutableList<Int>?
  // - MutableList<Int?>?
  // Note: use nullability annotations to improve this
  // Note: JSR-308 enables List<@NonNull Integer>
  val list = javaProducer.integers
}