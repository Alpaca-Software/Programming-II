package tendencias.ejercicio2;

public class Paciente {

  private float peso;
  private float altura;

  public Paciente(float peso, float altura) {
    this.peso = peso;
    this.altura = altura;
  }

  public float calcularIMC() {

    return peso / altura;
  }
}
