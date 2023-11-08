

package partial.two.exercise23;

import java.util.ArrayList;

/**
 *
 * @author pinto
 */
/*23. Store several integers in an list, now you must add the values 
that are in the following positions: zero, middle and last position.

23. Almacena varios números enteros en una lista, ahora debes sumar 
los valores que están en las siguientes posiciones: cero, media y última posición.
*/


public class App {

    public static void main(String[] args) {
        
        ArrayList<Number> numbers = new ArrayList<>();
        //{3,4,5,0,5) = 13
        
        numbers.add(new Number(3));
        numbers.add(new Number(4));
        numbers.add(new Number(5));
        numbers.add(new Number(0));
        numbers.add(new Number(5));
        
        
        Number.calculateSustractIndex(numbers);
       
    }
}
