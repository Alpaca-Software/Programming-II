package language.oop.exercise7;

/** 7. Request two numbers by keyboard, and show the greater of the two */
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number ");
    float numberOne = sc.nextFloat();

    System.out.print("Enter other number: ");
    float numberTwo = sc.nextFloat();

    Greater greater = new Greater(numberOne, numberTwo);

    float numberGreater = greater.calculateGreater();
    System.out.println("The number greater is " + numberGreater);
  }
}
