/*

1. Necesitas calcular el salario a pagar a un trabajador, tienes la cantidad
de días trabajados y el valor del día.

*/
package extra.practice.ejercicio1;

import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner m = new Scanner(System.in);

    System.out.print("Por favor digite el costo de el dia laborado: ");
    int valorDia = m.nextInt();
    System.out.println("Por favor digite la cantidad de dias trabajados por el empleado");
    int cantidadDias = m.nextInt();

    Trabajador t = new Trabajador(cantidadDias, valorDia);

    System.out.println("El salario del empleado es de : " + "$ " + t.calcularSalario());
  }
}
