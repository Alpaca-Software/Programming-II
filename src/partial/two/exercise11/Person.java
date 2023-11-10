package partial.two.exercise11;

import java.util.ArrayList;

/* @author pinto*/
public class Person {
  private String name;
  private double pay;
  public static double payReturn = 0;

  public Person(String name, double pay) {
    this.name = name;
    this.pay = pay;
  }

  public double getPay() {
    return pay;
  }

  public void setPay(double pay) {
    this.pay = pay;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public static ArrayList calculateMoneyBack(ArrayList<Person> person) {

    for (Person p : person) {
      Person.payReturn = p.pay * .02;
      Person.payReturn = p.pay - Person.payReturn;
      p.pay = Person.payReturn;
    }

    return person;
  }
}
