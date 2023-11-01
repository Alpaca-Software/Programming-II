package tendencias.ejercicio3;

public class Lote {

  private double ancho;
  private double largo;

  public Lote(double ancho, double largo) {
    this.ancho = ancho;
    this.largo = largo;
  }

  public double calcularArea() {

    return this.largo * this.ancho;
  }
}
