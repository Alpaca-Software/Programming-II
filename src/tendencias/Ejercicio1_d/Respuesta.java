package Ejercicio1_d;

public class Respuesta {

  String[] NOMBRE_NUMEROS = {"cero", "uno", "dos", "tres", "cuatro", "cinco"};

  public void mostrarNombre() {

    NumerosDao n = new NumerosDao();
    NumerosDto m = new NumerosDto(n.pedirNumero());

    for (int i = 0; i < NOMBRE_NUMEROS.length; i++) {

      if (m.getNumero() == i) {

        System.out.println("El numero es: " + NOMBRE_NUMEROS[i]);
      }
    }
  }
}
