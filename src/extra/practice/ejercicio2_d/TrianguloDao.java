package extra.practice.ejercicio2_d;

import java.util.*;

public class TrianguloDao {

  TrianguloDto t, t2;

  public void pedirDatos() {

    Scanner m = new Scanner(System.in);

    System.out.print("Digite el valor de la base del lote: ");
    double base = m.nextDouble();
    System.out.print("Digite el valor de la altura del lote: ");
    double altura = m.nextDouble();
    System.out.print("Digite el valor del lado1 del lote: ");
    double lado1 = m.nextDouble();
    System.out.print("Digite el valor del lado2 del lote: ");
    double lado2 = m.nextDouble();
    System.out.print("Digite el valor del lado3 del lote: ");
    double lado3 = m.nextDouble();

    t = new TrianguloDto(base, altura);
    t2 = new TrianguloDto(lado1, lado2, lado3);
  }

  public void calcularArea() {

    Area a = new Area();
    a.calcularArea(t);
  }

  public void calcularPerimetro() {

    Perimetro p = new Perimetro();
    p.calcularPerimetro(t2);
  }

  public void mostrarResultados() {

    pedirDatos();
    calcularArea();
    calcularPerimetro();
  }
}
