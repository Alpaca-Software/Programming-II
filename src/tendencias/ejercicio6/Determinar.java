package tendencias.ejercicio6;

import java.util.Scanner;

public class Determinar {

  Scanner m = new Scanner(System.in);
  private int[] numeros = new int[10];

  public void determinarParImpar() {

    llenarNumeros();

    for (int i = 0; i < numeros.length; i++) {

      if ((numeros[i] % 2) == 0) {

        System.out.println("Es par");
      } else {
        System.out.println("Es impar");
      }
    }
  }

  private void llenarNumeros() {

    System.out.println("Por favor llene los valores a evaluar");

    for (int i = 0; i < numeros.length; i++) {

      numeros[i] = m.nextInt();
    }
  }
}
