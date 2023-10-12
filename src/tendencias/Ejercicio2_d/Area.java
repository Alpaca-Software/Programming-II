package Ejercicio2_d;

public class Area {

  public void calcularArea(TrianguloDto t) {

    double base = 0;

    if (t.getBase() >= 100.1 && t.getBase() <= 100.9) {

      base = Math.floor(t.getBase());
    }

    double area = (base * t.getAltura()) / 2;

    System.out.println("El area del lote es de: " + area + " m^2");
  }
}
