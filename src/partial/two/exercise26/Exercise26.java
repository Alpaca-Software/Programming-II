package partial.two.exercise26;

import java.util.ArrayList;

/*27. Store four body parts in a list, display the information stored by the
console using a loop, it should display the data from the last position to the first.

27. Almacene cuatro partes del cuerpo en una lista, muestre la información almacenada
por la consola usando un bucle, debe mostrar los datos desde la última posición hasta la primera.
 */
public class Exercise26 {

  public static void main(String[] args) {
    ArrayList<Body> body = new ArrayList<>();

    body.add(new Body("eyes"));
    body.add(new Body("Head"));
    body.add(new Body("Nose"));
    body.add(new Body("Hand"));

    Body.showListPartysBody(body);
  }
}
