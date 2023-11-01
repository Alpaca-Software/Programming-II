package tendencias.E2;

import java.util.ArrayList;
import java.util.Scanner;

public class IMC {

  Paciente p;
  ArrayList<Paciente> pacientes = new ArrayList<>();

  public void pedirDatosPacientes() {

    Scanner m = new Scanner(System.in);
    int opcion = 0;

    do {

      System.out.println("Digite el peso del paciente ");
      double peso = m.nextDouble();
      System.out.println("Digite la altura del paciente recuerde que es en metros");
      double altura = m.nextDouble();

      pacientes.add(new Paciente(peso, altura));

      System.out.println("Digite la opcion deseada");
      System.out.print("1-Agregar otro paciente\n2-No agregar mas pacientes");
      opcion = m.nextInt();

    } while (opcion == 1);
  }

  public void calcularIMC() {

    double totalIMC = 0;

    for (int i = 0; i < pacientes.size(); i++) {

      totalIMC +=
          pacientes.get(i).getPesoPaciente() / Math.pow(pacientes.get(i).getAlturaPaciente(), 2);
    }

    System.out.println("El promedio de IMC es de: " + totalIMC / pacientes.size());
  }
}
