package partial.two.exercise27;

import java.util.ArrayList;

/*
26. Store ages and names in a list, now you want to
know how many of them are minors and how many are adults.

26. Almacena edades y nombres en una lista, ahora quieres
saber cuántos de ellos son menores y cuántos son adultos.
 */
public class Exercise27 {

  public static void main(String[] args) {
    ArrayList<Person> persons = new ArrayList<Person>();

    persons.add(new Person(17, "shairet"));

    persons.add(new Person(18, "Gisela"));

    persons.add(new Person(11, "Andry"));

    persons.add(new Person(63, "Libardo"));

    Person.showPersonLegalAndMinorAge(persons);
  }
}
