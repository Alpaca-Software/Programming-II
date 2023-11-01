package extra.practice.ejercicio4;

public class Empleado {

  private final int SALARIO_MINIMO = 1000000;
  private final int BONO = 140606;
  private int salario;

  public Empleado(int salario) {
    this.salario = salario;
  }

  public int calcularSalario() {

    if (salario < SALARIO_MINIMO) {

      return salario + BONO;
    }
    return salario;
  }
}
