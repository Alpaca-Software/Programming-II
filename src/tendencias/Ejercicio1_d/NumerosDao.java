package Ejercicio1_d;

import java.util.*;

public class NumerosDao {

  public int pedirNumero() {

    Scanner m = new Scanner(System.in);

    System.out.println("Digite el numero que desea buscar ");
    int numero = m.nextInt();

    return numero;
  }
}
