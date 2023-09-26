/* "9. Create a list of people who appeared in a job interview, the data you
need is: the name and the salary they want to earn, you must go through the
list and count how many of them will be hired, and it all depends on
whether the value requested by each worker is less than a MINIMUM." */

/* "9. Crea una lista de personas que aparecieron en una entrevista de
trabajo, los datos que necesitas son: el nombre y el salario que quieren
ganar, debes revisar la lista y contar cuantos de ellos serán contratados,
y todo depende de si el valor so licitado por cada trabajador es inferior a
un MÍNIMO." */

package Partial.One.Exercise9;

public class Main {
  public static void main(String[] args) {
    Interviewee[] interviewees = {
      new Interviewee("Juan", "1242452432", 900_000),
      new Interviewee("Pepe", "5242452432", 1_500_000),
      new Interviewee("Lucas", "125842432", 1_100_000),
    };

    for (Interviewee i : interviewees) {
      System.out.println(i.toString());
    }

    System.out.printf(
        "\nNumber of potential employees: %d\n", Interviewee.potentialEmployees(interviewees));
  }
}
