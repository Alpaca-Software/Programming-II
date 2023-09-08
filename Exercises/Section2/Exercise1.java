// Topic: CONTROL STRUCTURES - Estructuras de Control.

// Exercise 1: Request a digit by keyboard and
//             display its value in words on
//             the console.
//
//             Solicita un dígito por teclado y
//             muestra su valor en palabras en
//             la consola.

import java.util.Scanner;

public class Request {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un dígito: ");
    int digit = sc.nextInt();

    String name;
    if (digit == 0) {
      name = "Cero";
    } else if (digit == 1) {
      name = "Uno";
    } else if (digit == 2) {
      name = "Dos";
    } else if (digit == 3) {
      name = "Tres";
    } else if (digit == 4) {
      name = "Cuatro";
    } else if (digit == 5) {
      name = "Cinco";
    } else if (digit == 6) {
      name = "Seis";
    } else if (digit == 7) {
      name = "Siete";
    } else if (digit == 8) {
      name = "Ocho";
    } else if (digit == 9) {
      name = "Nueve";
    } else {
      System.out.print("\nSe necesita UN dígito.");
      return;
    }

    System.out.printf("\nDígito: %d\n", digit);
    System.out.printf("Literal: %s\n", name);
  }
}
