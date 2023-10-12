
package coco77.exercise1;

/**
"1. Elaborar una lista de empleados con los siguientes datos: nombre y días trabajados.
     Envía la lista a un método que calcula el salario de cada trabajador y devuelve una nueva lista con el nombre y el salario calculado.
     Mostrar la nueva lista por consola."
 */
public class Exercise1 {

    public static void main(String[] args) {
        
        Employe employes[] = new Employe[4];
        
        employes[0] = new Employe("felipe",18);
        employes[1] = new Employe("andrey",40);
        employes[2] = new Employe("Gisela",30);
        employes[3] = new Employe("Coco77",0);
        
        Employe[] employess = Employe.calculateSalaryEmploye(employes, employes.length);
        
        for (Employe e : employess) {
            System.out.println(e.getNameEmploye()+" = "+e.getDayWorker());
        }
        
        
        
    }
}
