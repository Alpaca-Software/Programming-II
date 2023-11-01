package review.exercise1;

import java.util.Scanner;

public class Main {

  static final double SALARY = 45_000;
  static final double MINIMUM_SALARY = 1_160_000;
  static final double TRANSPORT_BONUS = 50_000;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Name: ");
    String name = sc.nextLine();

    System.out.print("Days workded: ");
    double days = sc.nextDouble();

    System.out.printf("Salary of %s is $%.0f\n", name, addTransportBonus(getSalary(days)));
  }

  public static double getSalary(double days) {
    return days * Main.SALARY;
  }

  public static double addTransportBonus(double salary) {
    if (salary < Main.MINIMUM_SALARY / 2) {
      return salary + Main.TRANSPORT_BONUS;
    }

    return salary;
  }
}
