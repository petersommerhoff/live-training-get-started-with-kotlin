package _08_generics;

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
public class JavaUnsafeArrays {

  public static void main(String[] args) {

    // (1) Can assign Integer[] to Number[] because arrays are covariant
    Number[] numbers = new Integer[1];

    // (2) Unsafe: can now add double into Integer[]
    numbers[0] = 1.234;  // Note: ArrayStoreException at runtime

    System.out.println(numbers[0]);
  }
}
