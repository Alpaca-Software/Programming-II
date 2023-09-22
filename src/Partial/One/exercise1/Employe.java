package coco77.exercise1;


public class Employe {
  private String document;
  private String name;
  private double dayWorked;

  public static final double dayWorkedPay = 38.667;

  public static double salaryToPay;

  public Employe(String document, String name, int dayWorked) {
    this.document = document;
    this.name = name;
    this.dayWorked = dayWorked;
  }

  public String getDocument() {
    return this.document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getDayWorked() {
    return this.dayWorked * Employe.dayWorkedPay;
  }

  public void setDayWorked(int dayWorked) {
    this.dayWorked = dayWorked;
  }

  public static void calculateSalaryToPay(Employe[] employe) {
    for (Employe e : employe) {
      System.out.println(
          "The salary to pay a employe " + e.getName() + " es de: " + e.getDayWorked() + " $");
    }
  }
}
