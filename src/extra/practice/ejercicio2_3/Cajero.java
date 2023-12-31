package extra.practice.ejercicio2_3;

public class Cajero extends Empleado {

  public Cajero(String nombre, double totalVentas) {
    super(nombre, totalVentas);
  }

  @Override
  public void calcularSalario() {

    if (super.totalVentas > VALOR_VENTA_BASE) {

      double salario = super.totalVentas + (SALARIO_MINIMO * PORCENTAJE_BONO);
      System.out.println("El salario es del empleado " + super.nombre + " es de: " + salario);

    } else {

      System.out.println(
          "El salrio de el empleado " + super.nombre + "es de: " + super.totalVentas);
    }
  }
}
