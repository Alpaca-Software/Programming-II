package partial.two.exercise14;

import java.util.ArrayList;

/* @author Pinto77*/
public class Number {
  private double number;
  public static Double minNumber;
  public static double maxNumber;

  public Number(double number) {
    this.setNumber(number);
  }

  public double getNumber() {
    return number;
  }

  public void setNumber(double number) {
    this.number = number;
  }

  public static double calculateMinNumber(ArrayList<Number> numbers) {

    Number.minNumber = numbers.get(0).getNumber();

    for (Number n : numbers) {
      if (n.number < Number.minNumber) {
        Number.minNumber = n.number;
      }
    }

    return Number.minNumber;
  }

  public static double calculateMaxNumber(ArrayList<Number> numbers) {

    Number.minNumber = numbers.get(0).getNumber();

    for (Number n : numbers) {
      if (n.number > Number.maxNumber) {
        Number.maxNumber = n.number;
      }
    }

    return Number.maxNumber;
  }
}
