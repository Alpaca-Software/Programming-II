package oOP.example1;

public class Number {
  final String[] NAMES = {
    "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
  };
  public int number;

  public Number(int digito) {
    this.number = digito;
  }

  public void allowDigit() {
    if (this.number < 10 && this.number >= 0) {
      System.out.println("It's a digit");
    } else {
      System.out.println("It's not a digit");
    }
  }

  public void showName() {

    System.out.println(this.NAMES[this.number]);
  }
}
