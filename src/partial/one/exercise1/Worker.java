package partial.one.exercise1;

/** */
public class Worker {

  static final float payDay = 38667;
  String workers[];
  String documet;
  String name;
  int workedDay;

  public Worker(String[] workers, String documet, String name, int workedDay) {
    this.workers = workers;
    this.documet = documet;
    this.name = name;
    this.workedDay = workedDay;
  }

  public void salaryPayment(String[] workes) {
    int c = workes.length;
    float payWorked = 0;

    for (int i = 0; i < c; i++) {
      payWorked = workedDay * Worker.payDay;
      System.out.println(
          "the total value of the payroll a " + workes[i] + " is the $: " + payWorked);
    }
  }
}
