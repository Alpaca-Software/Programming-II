package partial.two.exercise8;

import java.util.ArrayList;

/*"8. Create a list of three people with the following
data: name, document and age.
    You must average the age."
@author pinto
 */
public class Exercise8 {

  public static void main(String[] args) {

    ArrayList<Person> people = new ArrayList<>();

    people.add(new Person("felipe", "1049017557", 18));

    people.add(new Person("pinto", "1089595791", 18));

    people.add(new Person("felipe", "1049017557", 20));

    people.add(new Person("felipe", "1049017557", 18));

    float averageAge = Person.averageAge(people);

    System.out.println("averageAge = " + averageAge);
  }
}
