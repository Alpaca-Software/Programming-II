package exercise24;

import java.util.ArrayList;

public class Donation extends ArrayList<Double> {

  public int contarDonaciones() {
    int contador = 0;
    for (Double donacion : this) {
      contador++;
    }
    return contador;
  }

  public double sumarDonaciones() {
    double suma = 0.0;
    for (Double donacion : this) {
      suma += donacion;
    }
    return suma;
  }
}
