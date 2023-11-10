package partial.two.exercise13;

import java.util.ArrayList;

/* @author pinto
"13. Create a list of integers, with a
loop count how many numbers are digits and how many are non-digits.
Use two methods."
 */
public class Exercise13version1 {

  public static void main(String[] args) {

    ArrayList<Number> numbers = new ArrayList<>();

    numbers.add(new Number(77));
    numbers.add(new Number(8));
    numbers.add(new Number(77));
    numbers.add(new Number(2));
    numbers.add(new Number(1));

    int countDigit = Number.isDigit(numbers);

    int countNotDigit = Number.notIsDigit(numbers);

    System.out.println("countDigit = " + countDigit);
    System.out.println("countNotDigit = " + countNotDigit);
  }
}
