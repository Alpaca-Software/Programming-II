package tendencias.Ejercicio4_d;

public class Pares {

  NumerosDto n;
  NumerosDao n2 = new NumerosDao();

  public void contadorParesImpares() {

    n = new NumerosDto(n2.llenarMatriz());
    int cPares = 0;
    int cImpares = 0;

    for (int i = 0; i < 3; i++) {

      for (int j = 0; j < 3; j++) {

        System.out.print(n.getNumeros()[i][j]);

        if (n.getNumeros()[i][j] % 2 == 0) {
          cPares++;
        } else {
          cImpares++;
        }
      }

      System.out.println(" ");
    }

    System.out.println("La cantidad de pares es de: " + cPares);
    System.out.println("La cantidad de impares es de: " + cImpares);
  }
}
