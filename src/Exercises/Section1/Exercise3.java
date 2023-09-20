// Topic: ARITHMETIC OPERATORS - Operadores Aritméticos.

// Exercise 3: An architect needs to find the
//             area of a rectangular lot, check
//             the formula with your classmates
//             or on the internet.
//
//             Un arquitecto necesita hallar el
//             área de un terreno rectangular,
//             comprueba la fórmula con tus
//             compañeros o en Internet.

// Fórmula: Largo * Ancho.
//
// Ejemplo: Largo = 30 m; Ancho = 10 m.
// Cálculo: 30 * 10 = 300 m².

public class Area {

  public static void main(String[] args) {
    // Inputs.
    // Maybe we should consider using `java.util.Scanner`?
    float length = 30; // In Meters.
    float width = 10; // In Meters.

    System.out.printf("Largo: %.2f m\n", length);
    System.out.printf("Ancho: %.2f m\n", width);

    System.out.printf("\nÁrea: %.2f m²\n", length * width);
  }
}
