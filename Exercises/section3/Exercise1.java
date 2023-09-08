package fundamento;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class color {

  static final String MORADO = "purple";

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String colores[] = new String[5];

    colores[0] = "red";
    colores[1] = "green";
    colores[2] = "yellow";
    colores[3] = "black";
    colores[4] = "purple";

    String colorBuscado = JOptionPane.showInputDialog("Input the color a searc:");

    boolean encontrado = verificarColor(colores, colorBuscado);

    if (encontrado) {
      System.out.println("El color " + colorBuscado + " fue encontrado: ");
    } else {
      System.out.println("No encontrado");
    }

    modificarArray(colores);

    System.out.println(" # " + Arrays.toString(colores));
  }

  public static boolean verificarColor(String colores[], String colorBuscado) {
    boolean encontrado = false;
    int cantidadColores = colores.length;

    for (int i = 0; i < cantidadColores; i++) {
      if (MORADO.equalsIgnoreCase(colores[i])) {
        colores[i] = "green";
        modificarArray(colores);
      } else if (colorBuscado.equalsIgnoreCase(colores[i])) {
        encontrado = true;
      }
    }

    return encontrado;
  }

  public static String[] modificarArray(String colores[]) {

    return colores;
  }
}
