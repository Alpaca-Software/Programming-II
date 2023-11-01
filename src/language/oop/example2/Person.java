package language.oop.example2;

public class Person {

  String document;
  String name;
  int age;
  String genre;

  static final int LEGAL_AGE = 18;
  static final String SEX_WOMAN = "F";
  static final String SEX_MAN = "M";

  public Person(String document, String name, int age, String genre) {
    this.document = document;
    this.name = name;
    this.age = age;

    this.genre = genre;
  }

  public boolean isMan() {
    return this.genre.equalsIgnoreCase(Person.SEX_MAN);
  }

  public boolean isLegalAge() {
    return this.age >= Person.LEGAL_AGE;
  }

  public boolean isAccepted() {
    return !this.isMan() && this.isLegalAge();
  }
}
