/*

2. Un médico necesita encontrar el IMC de los pacientes, 
verifique la fórmula IMC con sus colegas o en Internet.

*/
package ejercicio2;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner m = new Scanner (System.in);
        
        System.out.print("Digite el peso del paciente: ");
        float peso=m.nextFloat();
        System.out.print("Digite la altura del paciente: ");
        float altura=m.nextFloat();
        
        Paciente p = new Paciente(peso, altura);
        System.out.println("El IMC del paciente es de: "+p.calcularIMC());
    }
}
