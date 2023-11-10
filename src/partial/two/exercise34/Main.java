/*
 * You must store the following data:
      A. The name, document number and code of a teacher.
      B. The name, document number and code of a student.
      C. Now you must create two teacher objects and two student objects.
      D. Store the four objects in a list.
      E. A functionality is needed that counts how many people are over 20 years old.
*/

package partial.two.exercise34;

public class Main {
  public static void main(String[] args) {
    Person[] persons =
        new Person[] {
          new Teacher("Victor", "135798642", 35, "12345"),
          new Teacher("Hugo", "563573457", 28, "54627"),
          new Student("Priscila", "372582538", 19, "192155"),
          new Student("Anastasia", "345363538", 21, "192155"),
        };

    for (Person person : persons) {
      System.out.println(person);
    }

    int overAge = 20;
    System.out.printf(
        "\nThere are %d persons olden than %d.\n", Person.countAgeOver(persons, overAge), overAge);
  }
}
