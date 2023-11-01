// Topic: ARITHMETIC OPERATORS - Operadores Aritméticos.

// Exercise 4: An employee receives his monthly
//             salary in Colombian currency, if
//             he receives less than one minimum
//             wage, add a transport bonus.
//
//             Un empleado recibe su salario mensual
//             en moneda colombiana, si recibe menos
//             de un salario mínimo, añade una prima
//             de transporte.

public class Exercise4 {

  // Constants.
  static final float MINIMUM_WAGE = 1_300_606;
  static final float TRANSPORT_BONUS = 140_606;

  public static void main(String[] args) {
    // Inputs.
    // float salary = 2_845_000;
    float salary = 875_000;

    System.out.printf("Salario Mínimo: $%.0f\n", MINIMUM_WAGE);
    System.out.printf("Prima de Transporte: $%.0f\n", TRANSPORT_BONUS);

    System.out.printf("\nSalario del Trabajador: $%.0f\n", salary);

    if (salary < MINIMUM_WAGE) {
      System.out.println("Prima de Transporte: Sí");
      System.out.printf("\nTotal a Pagar: $%.0f\n", salary + TRANSPORT_BONUS);

      return;
    }

    System.out.println("Prima de Transporte: No");
    System.out.printf("\nTotal a Pagar: $%.0f\n", salary);
  }
}
