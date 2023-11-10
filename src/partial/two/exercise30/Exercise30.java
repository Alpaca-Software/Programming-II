
package coco77.exercise30;

import java.util.ArrayList;
import java.util.List;

/*"30. Store a list of five parts of the house in a list,
now you must iterate the collection and each element must be stored in
a second list to show it through the console."

"30. Almacena una lista de cinco partes de la casa en una lista, 
ahora debes iterar la colección y cada elemento debe almacenarse en
una segunda lista para mostrarlo a través de la consola."
 */
public class Exercise30 {

    public static void main(String[] args) {
        
        ArrayList<House> house = new ArrayList<>();
        
        house.add(new House("baño"));
        house.add(new House("cuarto"));
        house.add(new House("cocina"));      
        house.add(new House("sala"));
        house.add(new House("comedor"));
        
        List<House> house1 = House.concatPartysHouse(house);
        
        for (House h : house1) {
            System.out.println(h.partyHouse);
        }
    }
}
