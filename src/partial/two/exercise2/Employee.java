package Partial.Two.Exercise2;

public class Employee {

  protected String nameEmploye;
  protected float dayWorked;
  public static final float PAYDAY = 40000;
  public static final float SMMLV = 1160000;
  public static final float BONUS = 140000;

  public Employee(String nameEmploye, int dayWorked) {
    this.setNameEmploye(nameEmploye);
    this.setDayWorked(dayWorked);
  }

  public String getNameEmploye() {
    return nameEmploye;
  }

  public void setNameEmploye(String nameEmploye) {
    this.nameEmploye = nameEmploye;
  }

  public float getDayWorked() {
    return dayWorked;
  }

  public void setDayWorked(float dayWorked) {
    this.dayWorked = dayWorked;
  }

  public static void calculateSalaryToPay(Employee[] employes) {

    for (Employee e : employes) {

      e.setDayWorked(e.dayWorked * PAYDAY);
    }

    for (Employee e : employes) {
      System.out.println(e.nameEmploye + " el salario del empleado es de:  " + e.dayWorked);
    }

    System.out.println("###############################");
    bonificationEmploye(employes);
  }

  public static void bonificationEmploye(Employee[] salarys) {

    for (Employee e : salarys) {

      if (e.dayWorked < SMMLV) {
        e.dayWorked += BONUS;
      }
    }

    for (Employee e : salarys) {
      System.out.println(e.nameEmploye + " el salario del empleado es de:  " + e.dayWorked);
    }
  }
}
