package partial.two.exercise16;

/*coco77
 */
import java.util.ArrayList;

public class Number {

  private double number;
  public static double totalSum = 0;

  public Number(double number) {
    this.number = number;
  }

  public double getNumber() {
    return number;
  }

  public void setNumber(double number) {
    this.number = number;
  }

  public static double calculateSumTotal(ArrayList<Number> numbers) {

    for (Number n : numbers) {
      Number.totalSum += n.number;
    }

    return Number.totalSum;
  }
}
