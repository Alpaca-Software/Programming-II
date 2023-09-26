/* 10. Create a list of integers, with a loop go through it and count how many
 * numbers are digits and how many are not digits. */

/* 10. Crea una lista de números enteros, con un bucle revísela y cuenta
 * cuántos números son dígitos y cuántos no son dígitos. */
package Partial.One.Exercise10;

public class Main {
  public static void main(String[] args) {
    int[] inputs = {1, 3, 5, 3, 6, 664, 23, 6, 23, 64, 0, 9, -2};

    Integer[] integers = new Integer[inputs.length];

    for (int i = 0; i < inputs.length; i++) {
      integers[i] = new Integer(inputs[i]);
    }

    System.out.printf("Number of digits: %d\n", Integer.countDigits(integers));
  }
}
