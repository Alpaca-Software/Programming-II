package ExerciseClass.Pillares.coco77.javaapplicationtest;

import newpackage.Customer;

/** */
public class JavaApplicationTest {

  public static void main(String[] args) {

    Customer customer1 = new Customer("1049019557", "Felipe", 200000);

    /*
    customer1.document = "1049019557";
    customer1.name = "Felipe";
    customer1.save = 100000;*/

    // customer1.setDocument("1049019557");

    // customer1.setName("Felipe");
    // customer1.setSave(400000);

    System.out.println(customer1.getSave());
  }
}
