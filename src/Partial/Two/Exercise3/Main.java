
package Partial.Two.Exercise3;

import java.util.ArrayList;
import java.util.List;

/*
"3. A doctor needs the IMC of his patients.
    In a list it stores the weight and height.
    Create a method that receives the list of patients and returns a list of calculated IMC, now the list of calculated IMC must be sent to another method 
    that displays the highest IMC in the console."
*/
public class Main {
    
    public static void main(String[] args){
       
        
        List<Patient> patients = new ArrayList<>();
   
        
        patients.add(new Patient(80,1.80f));
        patients.add(new Patient(50,1.70f));
        patients.add(new Patient(67,1.90f));
        patients.add(new Patient(32,2.0f));
        patients.add(new Patient(52,1.56f));
        
        List<Double> imcs =  Patient.calculateImc((ArrayList<Patient>) patients);
     
        System.out.println(imcs);
        
        System.out.println(Patient.calculateHigherImc(imcs));
      
        
    }
}
