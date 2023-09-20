// Topic: ARITHMETIC OPERATORS - Operadores Aritméticos.

// Exercise 2:  A doctor needs to find the IMC
//              of patients, check the IMC formula
//              with your colleagues or on the internet.
//
//              Un médico necesita encontrar el IMC de
//              los pacientes, comprobar la fórmula del
//              IMC con sus colegas o en internet.

// Fórmula: Peso en kilogramos dividido por
//          la estatura en metros cuadrados.
//
// Ejemplo: Peso = 68 kg, Estatura = 165 cm (1.65 m).
// Cálculo: 68 ÷ (1.65)2 = 24.98.

public class IMC {

  public static void main(String[] args) {
    // Inputs.
    // Maybe we should consider using `java.util.Scanner`?
    int weight = 68; // In Kilograms.
    float height = 1.65f; // In Meters.

    System.out.printf("Peso: %d kg\n", weight);
    System.out.printf("Estatura: %.2f cm\n", height);

    System.out.printf("\nIMC: %.2f\n", weight / (height * height));
  }
}
