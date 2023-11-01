package partial.one.exercise1A;

/**
 * "1. Create a list of employees with the following data: the document, name and days worked, you
 * need to calculate the salary to be paid to each worker to know the total value of the payroll."
 */
public class Exercise1 {

  public static void main(String[] args) {
    Employe[] employe = new Employe[3];

    employe[0] = new Employe("1049019527", "felipe", 18);
    employe[1] = new Employe("10490197", "pinto", 12);
    employe[2] = new Employe("1049019553", "Andrey", 0);

    Employe.calculateSalaryToPay(employe);
  }
}
