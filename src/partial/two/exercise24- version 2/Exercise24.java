

package coco77.exercise24;

import java.util.ArrayList;

/* @author pinto
"24. Store donations from people in an list, donations were made in dollars, use a loop to sum and count donations.
      To know the amount of donations you should not use the .length()"

"24. Almacene las donaciones de las personas en una lista, las donaciones se 
hicieron en dólares, use un bucle para sumar y contar las donaciones.
        Para saber el monto de las donaciones no debes usar el .length()"

*/
public class Exercise24 {

    public static void main(String[] args) {
        ArrayList<Donation> donations = new ArrayList<>();
        
        donations.add(new Donation(70));
        donations.add(new Donation(7));
        donations.add(new Donation(50));       
        donations.add(new Donation(40));    
        donations.add(new Donation(77));   
        donations.add(new Donation(07));
        
        Donation.calculateDonations(donations);
    }
}
