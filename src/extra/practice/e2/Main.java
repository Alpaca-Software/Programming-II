/*
2. Un médico necesita encontrar el IMC de los pacientes, ahora debe
crear una lista de pacientes a atender y promediar los IMC del día.
*/
package extra.practice.e2;

public class Main {
  public static void main(String[] args) {

    IMC imc = new IMC();
    imc.pedirDatosPacientes();
    imc.calcularIMC();
  }
}
