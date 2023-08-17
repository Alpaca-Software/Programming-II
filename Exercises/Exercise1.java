// Topic: ARITHMETIC OPERATORS - Operadores Aritméticos.

// Exercise 1:  You need to calculate the salary
//              to be paid to a worker, you have
//              the number of days worked and the
//              value of the day.	
//
//              Necesitas calcular el salario a
//              pagar a un trabajador, tienes el
//              número de días trabajados y el
//              valor del día.

public class Salary {
  
  // Constants.
  static final int WORKED_DAYS = 30;
  static final float VALUE_DAY = 50_000f;
  
  public static void main(String[] args) {
    System.out.printf("Días Trabajados: %d\n", WORKED_DAYS);
    System.out.printf("Valor del Día: $%.0f\n", VALUE_DAY);
    
    System.out.printf("\nSalario a Pagar: $%.0f\n", WORKED_DAYS * VALUE_DAY);
  }
}
