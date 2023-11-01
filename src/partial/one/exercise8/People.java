package Partial.One.Exercise8;

public class People {

  public static double getJacpokt() {
    return jacpokt;
  }

  public static void setJacpokt(double aJacpokt) {
    jacpokt = aJacpokt;
  }

  private String name;
  private double contribute;
  public static double jacpokt = 1000000;
  public static double c = 0;
  public static String inversor;
  public static int indexPeople;

  public People(String name, double contribute) {
    this.name = name;
    this.contribute = contribute;
  }

  public People() {}

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getContribute() {
    return contribute;
  }

  public void setContribute(double contribute) {
    this.contribute = contribute;
  }

  public static void calculateProfits(People[] people, int size) {

    for (int i = 0; i < size; i++) {
      c = people[0].getContribute();

      inversor = people[i].getName();

      if (people[i].getContribute() > c) {
        indexPeople = i;
        c = people[i].getContribute();
        inversor = people[i].getName();
      }
    }

    System.out.println("the one who contributed the most was " + inversor);
    System.out.println("Ganancias: ");
    for (int i = 0; i < size; i++) {
      if (people[i] == people[indexPeople]) {
        people[indexPeople].setContribute(jacpokt / 2);
      } else {
        people[i].setContribute((jacpokt / 2) / (size - 1));
      }
    }

    for (People p : people) {
      System.out.println("the ganancia the: " + p.getName() + " = " + p.getContribute());
    }
  }
}
