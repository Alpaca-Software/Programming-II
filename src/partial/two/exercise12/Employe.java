package coco77.exercise12;

import java.util.ArrayList;

/* @author pinto */
public class Employe {

    public static double getSmmlv() {
        return smmlv;
    }

    public static void setSmmlv(double aSmmlv) {
        smmlv = aSmmlv;
    }
    private String name;
    private double salary;
    public static double smmlv = 1160000;

    public Employe(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int calulateEmployes(ArrayList<Employe> employes){
        
        int countEmploye =0;
        
        for (Employe e : employes) {
            if(e.salary<Employe.smmlv){
                countEmploye++;
            }
        }
        
        return countEmploye;
    }
    
}
