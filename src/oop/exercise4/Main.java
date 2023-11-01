package oop.exercise4;

/**
 * 4. Solicitar y almacenar un número por teclado y generar un número con la función aleatoria,
 * verificar en cuantos ciclos coinciden, el número solicitado no debe ser mayor a 20 ni menor o
 * igual a cero.
 */
import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a number: ");
    int number = sc.nextInt();

    Random random = new Random(number);

    random.veryRandom();
  }
}
