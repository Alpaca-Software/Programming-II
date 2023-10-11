package javaapplication;

public class Person {
  private String document;
  private String name1;
  private String name2;
  private String lastName1;
  private String lastName2;
  private int age;
  public static final int LEGAL_AGE = 18;

  public Person(
      String document, String name1, String name2, String lastName1, String lastName2, int age) {
    this.setDocument(document);
    this.setName1(name1);
    this.setName2(name2);
    this.setLastName1(lastName1);
    this.setLastName2(lastName2);
    this.setAge(age);
  }

  public void calculateLegalAge() {
    if (this.age >= LEGAL_AGE) {
      System.out.println("the student is legalAge: ");
    } else {
      System.out.println("the student not is LegalAge ");
    }
  }

  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public String getName1() {
    return name1;
  }

  public void setName1(String name1) {
    this.name1 = name1;
  }

  public String getName2() {
    return name2;
  }

  public void setName2(String name2) {
    this.name2 = name2;
  }

  public String getLastName1() {
    return lastName1;
  }

  public void setLastName1(String lastName1) {
    this.lastName1 = lastName1;
  }

  public String getLastName2() {
    return lastName2;
  }

  public void setLastName2(String lastName2) {
    this.lastName2 = lastName2;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{"
        + "document="
        + document
        + ", name1="
        + name1
        + ", name2="
        + name2
        + ", lastName1="
        + lastName1
        + ", lastName2="
        + lastName2
        + ", age="
        + age
        + '}';
  }
}
