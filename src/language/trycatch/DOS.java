package language.trycatch;

import java.util.Scanner;

public class DOS {
  public static void main(String[] args) {

    Scanner m = new Scanner(System.in);
    int numero = 0;
    boolean bandera;

    do {
      bandera = false;

      try {
        System.out.println("Ingrese un valor entero");
        numero = m.nextInt();

      } catch (Exception e) {

        System.out.println(e.toString());
        m.nextLine();
        bandera = true;
      }

    } while (bandera);
  }
}
