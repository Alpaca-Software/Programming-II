package Try;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = 0;
    boolean repetir;

    do {
      repetir = false;
      try {
        System.out.print("Introduce primer número entero: ");
        x = sc.nextInt();

      } catch (Exception e) {

        System.out.println("Valor no válido" + e.toString());
        sc.nextLine();
        repetir = true;
      }
    } while (repetir);

    System.out.println("int introducido -> " + x);
  }
}
