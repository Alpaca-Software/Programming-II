package partial.one.exercise1;

/*"1. Create a list of employees with the following data:
the document, name and days worked,
     you need to calculate the salary to be paid to each
worker to know the total value of the payroll."*/

public class Main {

  public static void main(String[] args) {

    String workers[] = {"Felipe", "Andrey", "Pinto", "Uribe"};

    String documet = "104901876";
    String name = "Felipe Pinto";
    int workedDay = 30;

    Worker worker = new Worker(workers, documet, name, workedDay);

    worker.salaryPayment(workers);
  }
}
