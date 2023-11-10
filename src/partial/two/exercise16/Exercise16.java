package partial.two.exercise16;

import java.util.ArrayList;

/*
"16. From the previous exercise, create a method that,
upon receiving the list of numbers, performs a sum and returns the value to the main method, that value will verify
      if it is an even number."
 */
public class Exercise16 {

  public static void main(String[] args) {
    ArrayList<Number> numbers = new ArrayList<>();

    numbers.add(new Number(77));
    numbers.add(new Number(7));
    numbers.add(new Number(0));
    numbers.add(new Number(2));
    numbers.add(new Number(80));
    numbers.add(new Number(3));
    numbers.add(new Number(5));

    double sumNumbers = Number.calculateSumTotal(numbers);

    System.out.println("sumNumbers = " + sumNumbers);

    if (sumNumbers % 2 != 0) {
      System.out.println("el numero " + sumNumbers + " es impar");
    } else {
      System.out.println("el numero " + sumNumbers + " es par");
    }
  }
}
