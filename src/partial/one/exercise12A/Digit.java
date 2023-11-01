package Partial.One.Exercise12A;

public class Digit {
  int digit;

  static final String[] SPANISH_NAME = {
    "Cero",
    "Uno",
    "Dos",
    "Tres",
    "Cuatro",
    "Cinco",
    "Seis",
    "Siete",
    "Ocho",
    "Nueve",
    "<Digito Inválido>",
  };

  static final String[] ENGLISH_NAME = {
    "Zero",
    "One",
    "Two",
    "Three",
    "Four",
    "Five",
    "Six",
    "Seven",
    "Eight",
    "Nine",
    "<Invalid Digit>",
  };

  public Digit(int digit) {
    if (digit >= 0 && digit <= 9) {
      this.digit = digit;
    } else {
      this.digit = 10;
    }
  }

  public String showSpanishName() {
    return Digit.SPANISH_NAME[this.digit];
  }

  public String showEnglishName() {
    return Digit.ENGLISH_NAME[this.digit];
  }
}
