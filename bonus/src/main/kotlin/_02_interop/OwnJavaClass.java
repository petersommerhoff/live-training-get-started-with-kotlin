package _02_interop;

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
class OwnJavaClass {

  private final int attribute;

  OwnJavaClass(int attribute) {
    this.attribute = attribute;
  }

  // (1) Only getter, no setter
  public int getAttribute() {
    return attribute;
  }

  void foo() {
    System.out.println("foo() called");
  }
}
