
package Partial.Two.Exercise3;

import java.util.ArrayList;
import java.util.List;

public class Patient {
    
    private float weight;
    private float height;

    public Patient(float weight, float height) {
        this.weight = weight;
        this.height = height;
    }
    
    public double calcularIMC() {
        // Fórmula del IMC: IMC = peso (kg) / (altura (m) * altura (m))
        return weight / (height * height);
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    

    public static List calculateImc(List<Patient> patients){
        
        List<Double> imc = new ArrayList<>();
        
        
        for (Patient p : patients) {
            double imcPatient = 0;
            imcPatient= p.weight/(p.height*p.height);
            imc.add(imcPatient);
        }
        
        
        return imc;
    }
    
    
    public static double calculateHigherImc(List<Double> patient){
        
        double imc = patient.get(0);
        
        for (Double p : patient) {
            if(p>imc){
                imc = p;
            }
        }
        
        return imc;
    }
}
