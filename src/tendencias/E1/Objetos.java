package E1;

public class Objetos {

  private String nombreProducto;
  private double precioProducto;

  public Objetos(String nombreProducto, double precioProducto) {
    this.nombreProducto = nombreProducto;
    this.precioProducto = precioProducto;
  }

  public String getNombreProducto() {
    return nombreProducto;
  }

  public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }

  public double getPrecioProducto() {
    return precioProducto;
  }

  public void setPrecioProducto(double precioProducto) {
    this.precioProducto = precioProducto;
  }

  @Override
  public String toString() {
    return "Objetos{"
        + "nombreProducto="
        + nombreProducto
        + ", precioProducto="
        + precioProducto
        + '}';
  }
}
