package partial.two.exercise15;

import java.util.ArrayList;

public class Number {
  private double number;
  public static int peerNumber = 0;
  public static int oddNumber = 0;

  public Number(double number) {
    this.number = number;
  }

  public double getNumber() {
    return number;
  }

  public void setNumber(double number) {
    this.number = number;
  }

  public static int calculateNumbersPeers(ArrayList<Number> numbers) {

    for (Number n : numbers) {
      if (n.number % 2 == 0) {
        Number.peerNumber++;
      }
    }

    return Number.peerNumber;
  }

  public static int calculateNumbersOdd(ArrayList<Number> numbers) {

    for (Number n : numbers) {
      if (n.number % 2 != 0) {
        Number.oddNumber++;
      }
    }

    return Number.oddNumber;
  }
}
