
package coco77.exercise11;

import java.util.ArrayList;
import java.util.List;

/* @author pinto 
"11. Tienes una lista de 3 personas con la siguiente información: 
el nombre y la cantidad en dinero que pagaron por un partido de fútbol, 
el partido fue cancelado y tuvieron que regresar
      el dinero con un 2% de descuento, envía la lista a un método y 
devuelve la misma lista con el descuento realizado."

*/
public class Exercise11 {

    public static void main(String[] args) {
        ArrayList<Person> person = new ArrayList<>();
        
        person.add(new Person("felipe",50000));
        
        person.add(new Person("luis",50000));
        
        person.add(new Person("carlos",50000));
        
        ArrayList<Person> payPeople  = Person.calculateMoneyBack(person);
        
        for (Person p : payPeople) {
            System.out.println("Para la persona "+p.getName()+" el total de devolución de dinero es de: "+p.getPay());
        }
    }
}
