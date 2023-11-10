package partial.two.exercise32;

import java.util.ArrayList;

public class Number {
  private int number;

  public Number(int number) {
    this.number = number;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public static void calculateDisplayNumbers(ArrayList<Number> numbers) {
    int size = numbers.size();
    int count = 0;

    for (int i = 1; i <= size; i += 2) {
      count += numbers.get(i - 1).getNumber();
    }

    System.out.println("La suma de las posiciones impares es de: " + count);
  }
}
