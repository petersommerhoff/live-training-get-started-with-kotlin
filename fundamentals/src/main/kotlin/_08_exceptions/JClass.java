package _08_exceptions;

import java.io.IOException;

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
public class JClass {

  public static void main(String[] args) {

    // === Unchecked exceptions ===
//    Unchecked.require(2 == 3, "Mathematics is no longer...");

    Appendable html = new StringBuilder();
    try {
      html.append("<html>");  // (1) Have to use try-catch
      html.append("</html>");
    } catch (IOException e) {
      e.printStackTrace();
    }
    System.out.println(html);

    // === Nothing type ===
    Void v = Nothing.fail("foo");  // (1) Return type Void
    System.out.println(v);         // (2) Dead code (not recognizable)

    Void v2 = null;                // (3) Void is closest to Nothing type in Kotlin (same as `Nothing?`)
  }
}
