package Partial.One.Exercise9;

public class Interviewee {
  String name;
  String document;
  float salary;

  static final float MINIMUM_WAGE = 1_200_000f;

  public Interviewee(String name, String document, float salary) {
    this.name = name;
    this.document = document;
    this.salary = salary;
  }

  public boolean meetsRequeriments() {
    return this.salary < Interviewee.MINIMUM_WAGE;
  }

  public String toString() {
    return String.format("<Interviewee (%s)[%.0f]>", this.name, this.salary);
  }

  public static int potentialEmployees(Interviewee[] interviewees) {
    int accepted = 0;
    for (Interviewee i : interviewees) {
      if (i.meetsRequeriments()) {
        accepted++;
      }
    }

    return accepted;
  }
}
