package partial.two.exercise12;

import java.util.ArrayList;

/* @author pinto
"12. Create a list of people who underwent a job interview, the data you need is: the name
and the salary they want to earn, you must review the list and count how many of
they will be hired, and it all depends on whether the value requested by each worker
is less than a MINIMUM wage. "
*/
public class Exercise12 {

  public static void main(String[] args) {
    ArrayList<Employe> employes = new ArrayList<>();

    employes.add(new Employe("Felipe", 18000000));
    employes.add(new Employe("luis", 1800000));
    employes.add(new Employe("mau", 102000));
    employes.add(new Employe("ferney", 1000000));
    employes.add(new Employe("lucia", 1000));

    int cantidaEmploye = Employe.calulateEmployes(employes);
    System.out.println("La cantida de empleados que seran contratados es de: " + cantidaEmploye);
  }
}
