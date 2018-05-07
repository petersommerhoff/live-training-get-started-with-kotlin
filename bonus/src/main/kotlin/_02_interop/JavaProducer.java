package _02_interop;

import java.util.Arrays;
import java.util.List;

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
public class JavaProducer {

  // (1) Any non-primitive type may be null in Java
  String getString() {
    return null;
  }

  Integer getInteger() {
    return null;
  }

  int getInt() {
    return 0;
  }

  // (2) Can use @NotNull annotation to indicate that at least the List is not null (but may contain null)
  List<Integer> getIntegers() {
    return Arrays.asList(1, 2, null);
//    return Arrays.asList(1, 2, 3);
//    return null;
  }
}
