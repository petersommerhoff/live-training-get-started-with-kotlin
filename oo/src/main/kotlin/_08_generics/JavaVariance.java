package _08_generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @author Peter Sommerhoff <peter@petersommerhoff.com>
 */
public class JavaVariance {

  public static void main(String[] args) {

    // (1) Compiler error
//    List<Number> producer = new ArrayList<Integer>();

    // (2) Covariance via <? extends T>
    List<? extends Number> producer = new ArrayList<Integer>();


    // (3) Compiler error
    Comparator<Person> personComparator = Comparator.comparingInt(value -> value.getName().length());
//    Comparator<Friend> judge = personComparator;

    // (4) Contravariance via <? super T>
    Comparator<? super Friend> judge = personComparator;
    judge.compare(new Friend("Joe"), new Friend("Michael-Patrick"));
  }
}
