package _02_interop;

import java.time.Instant;
import java.util.Date;

import static java.lang.System.out;

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
public class JavaCaller {

  public static void main(String[] args) {
    Date begin2018 = Date.from(Instant.parse("2018-01-01T00:00:00Z"));
    Date end2018 = Date.from(Instant.parse("2018-12-31T23:59:59Z"));

    // (1) File contents are available under DateUtils
    // (2) Extension function becomes method with two parameters; `until` is called `period` in Java
    DateRange year2018 = DateUtils.period(begin2018, end2018);

    // (3) val properties becomes attributes with getter
    out.println(year2018.getFrom());
    out.println(year2018.getTo());

    // (4) Extension property becomes method in DateUtils
    Instant begin2018Instant = DateUtils.getInstant(begin2018);
    out.println(begin2018Instant);
  }
}
