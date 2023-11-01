package tendencias.Ejercicio3_d;

public class Modificar {

  private final String valorCambiar = "purple";
  private final String valorNuevo = "green";

  public void modificarArray(String[] colores) {

    for (int i = 0; i < colores.length; i++) {

      if (colores[i].equalsIgnoreCase(valorCambiar)) {
        colores[i] = valorNuevo;
      }
    }
  }

  public void mostrarArray(String[] colores) {

    for (int i = 0; i < colores.length; i++) {

      System.out.println(colores[i]);
    }
  }
}
