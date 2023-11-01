package language.inheritance.example.hospital;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Person {

  protected String document;
  protected String name1;
  protected String name2;
  protected String surname1;
  protected String surname2;
  protected LocalDate birthDay;

  public Person(
      String document,
      String name1,
      String name2,
      String surname1,
      String surname2,
      String birthDay) {
    this.setDocument(document);
    this.setName1(name1);
    this.setName2(name2);
    this.setSurname1(surname1);
    this.setSurname2(surname2);
    this.setBirthDay(birthDay);
  }

  public int getAge() {
    return (int) ChronoUnit.YEARS.between(birthDay, LocalDate.now());
  }

  public boolean isThirdAge() {
    return this.getAge() >= 60;
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

  public String getSurname1() {
    return surname1;
  }

  public void setSurname1(String surname1) {
    this.surname1 = surname1;
  }

  public String getSurname2() {
    return surname2;
  }

  public void setSurname2(String surname2) {
    this.surname2 = surname2;
  }

  public LocalDate getBirthDay() {
    return birthDay;
  }

  public void setBirthDay(String birthDay) {
    DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    this.birthDay = LocalDate.parse(birthDay, format);
  }
}
