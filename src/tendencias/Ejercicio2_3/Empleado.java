package tendencias.Ejercicio2_3;

public abstract class Empleado {

  public String nombre;
  public double totalVentas;

  public final double SALARIO_MINIMO = 1160000;
  public final double PORCENTAJE_BONO = 0.10;
  public final double VALOR_VENTA_BASE = 1000000;

  public Empleado(String nombre, double totalVentas) {

    this.nombre = nombre;
    this.totalVentas = totalVentas;
  }

  public abstract void calcularSalario();
}
