package extra.practice.ejercicio3_d;

public class NumerosDao {

  private final String[] colores = {"purple", "brown", "yellow", "green", "blue"};
  NumerosDto n;

  public void enviarValores() {

    n = new NumerosDto(colores);
  }

  public void mostrarValores() {

    enviarValores();

    Modificar m = new Modificar();
    m.modificarArray(n.getColores());
    m.mostrarArray(colores);
  }
}
