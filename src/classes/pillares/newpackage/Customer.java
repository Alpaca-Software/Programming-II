package classes.pillares.newpackage;

public class Customer {

  public static double getINTEREST() {
    return INTEREST;
  }

  private String document;
  private String name;
  private double save;
  private double total;

  private static final double INTEREST = 1.01;

  public Customer() {}

  public Customer(String document, String name, double save) {
    // this.document = document;
    // this.name = name;
    // this.save = save;

    setDocument(document);
    setName(name);
    setSave(save);
  }

  // public void calculateInterest(){
  //   this.total = this.save * INTEREST;
  // }

  public String getDocument() {
    return document;
  }

  public String getName() {
    return name;
  }

  public double getSave() {
    return save;
  }

  public double getTotal() {
    return total;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setSave(double save) {
    this.save = save * INTEREST;
    // this.save = this.total = this.save * INTEREST;
  }

  public void setTotal(double total) {
    this.total = total;
  }
}
