package OOP.Example1;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Input a digit: ");
    int number = sc.nextInt();
    // constructor = recibe datos de afuera

    Number numberOne = new Number(number);

    numberOne.allowDigit();
    numberOne.showName();
  }
}
