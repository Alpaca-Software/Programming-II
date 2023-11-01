package extra.practice.ejercicio4_d;

import java.util.Random;

public class NumerosDao {

  Random r = new Random();
  int[][] numeros = new int[3][3];

  public int[][] llenarMatriz() {

    for (int i = 0; i < 3; i++) {

      for (int j = 0; j < 3; j++) {

        numeros[i][j] = r.nextInt(10) + 1;
      }
    }

    return numeros;
  }
}
