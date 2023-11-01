package tendencias.Ejercicio2_d;

public class Perimetro {

  public void calcularPerimetro(TrianguloDto t) {

    double perimetro = t.getLado1() + t.getLado2() + t.getLado3();
    System.out.println("El perimetro del lote es de: " + perimetro + " m");
  }
}
