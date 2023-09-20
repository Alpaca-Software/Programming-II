// Methods - Métodos.

// Exercise 5: Request numbers by keyboard using a
//             loop and save them in an array, you
//             must send the array to a method and
//             perform math operations on the data.
//
// Ejercicio 5: Solicita números por teclado mediante
//              un bucle y guárdalos en un array, debes
//              enviar el array a un método y realizar
//              operaciones matemáticas con los datos.

import java.util.Scanner;

public class Exercise5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("¿Cuantos numeros va a ingresar?: ");
    int[] numbers = new int[sc.nextInt()];

    // Fill array.
    for (int i = 0; i < numbers.length; i++) {
      System.out.printf("  %d° Valor: ", i + 1);
      numbers[i] = sc.nextInt();
    }

    operateArray(numbers);
    showArray(numbers);
  }

  public static void operateArray(int[] array) {
    System.out.println("\nSumando tres y dividiendo por dos cada valor ingresado...");

    // Sum the number three and divide it for two.
    for (int i = 0; i < array.length; i++) {
      array[i] = (array[i] + 3) / 2;
    }
  }

  public static void showArray(int[] array) {
    System.out.println("\nResultados:");
    for (int item : array) {
      System.out.printf(" - %d\n", item);
    }
  }
}
