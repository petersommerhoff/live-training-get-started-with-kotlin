package _08_exceptions;

import java.io.IOException;

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
public class JClass {

  public static void main(String[] args) {

    // (1) Compiler doesn't complain unless Kotlin uses @Throws annotation
//    Unchecked.require(2 == 3, "Mathematics is no longer...");

    Appendable html = new StringBuilder();
    try {
      html.append("<html>");  // (1) Have to use try-catch
      html.append("</html>");
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(html);

    // (2) Nothing type
    Void v = Nothing.fail("foo");  // Note: Return type is Void
    System.out.println(v);         // Note: dead code (not recognizable)

    Void v2 = null;                // Note: Void is closest to Nothing type in Kotlin (same as `Nothing?`)
  }
}
