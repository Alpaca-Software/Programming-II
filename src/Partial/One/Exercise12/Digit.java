package coco77.exercise12;

public class Digit {

  int digit;
  String language;
  static final String DIGITS_SPANISH[] = {
    "cero", "uno", "dos", "tres", "cuatro", "cinco", "seix", "siete", "ocho", "nueve"
  };
  static final String DIGITS_ENGLISH[] = {
    "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"
  };

  public Digit(int digit, String lenguage) {
    this.digit = digit;
    this.language = lenguage;
  }

  public boolean isSpanish() {
    return this.language.equalsIgnoreCase("español");
  }

  public Digit(int digit) {
    this.digit = digit;
  }

  public void showWord() {
    if (isSpanish()) {
      System.out.println("the digit en spanish is: " + Digit.DIGITS_SPANISH[digit]);

    } else {
      System.out.println("the digit en English is: " + Digit.DIGITS_ENGLISH[digit]);
    }
  }
}
