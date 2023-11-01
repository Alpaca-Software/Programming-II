package extra.practice.ejercicio1;

public class Trabajador {

  private int cantidadDias;
  private final int VALOR_DIA;

  public Trabajador(int cantidadDias, int VALOR_DIA) {

    this.cantidadDias = cantidadDias;
    this.VALOR_DIA = VALOR_DIA;
  }

  public double calcularSalario() {

    return this.cantidadDias * this.VALOR_DIA;
  }
}
