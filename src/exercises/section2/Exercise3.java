/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercises.section2;

import java.util.Scanner;

/**
 * 3. Enseñar las vocales al sistema a través de un SWITCH, luego pedir una letra en el teclado y
 * comprobar si es una vocal.
 */
public class Exercise3 {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Ingrese una letra para corroborrar que sea una vocal ");

    String vocal = sc.nextLine();

    switch (vocal.toLowerCase()) {
      case "a":
        System.out.println("Es una vocal");
        break;
      case "e":
        System.out.println("Es una vocal");
        break;
      case "i":
        System.out.println("Es una vocal");
        break;
      case "o":
        System.out.println("Es una vocal");
        break;
      case "u":
        System.out.println("Es una vocal");
        break;

      default:
        System.out.println("No es una vocal");
    }
  }
}
