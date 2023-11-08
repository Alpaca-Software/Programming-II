
package coco77.exercise24;

import java.util.ArrayList;


public class Donation {
    private double donation;

    public Donation(double donation) {
        this.donation = donation;
    }

    public double getDonation() {
        return donation;
    }

    public void setDonation(double donation) {
        this.donation = donation;
    }
    
    public static void calculateDonations(ArrayList<Donation> donations){
        int c = 0;
        for (Donation d : donations) {
            c++;
        }
        System.out.println("La cantida de donaciones que se realizaron fueron "+c);
        
       double f =0;
        for (Donation d : donations) {
            f +=  d.donation;
        }
        
        System.out.println("La cantidad de dolares recogidos es de: "+f);
    }
    
    
}
