/*
5. Enseñar las vocales al sistema a través de un SWITCH, luego pedir una letra ,
en el teclado y comprobar si es una vocal
*/
package extra.practice.ejercicio5;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner m = new Scanner(System.in);

    String palabra;

    System.out.println("Digite la palabra que desea evaluar");
    palabra = m.next();

    Vocales v = new Vocales(palabra);
    v.evaluarVocales();
  }
}
