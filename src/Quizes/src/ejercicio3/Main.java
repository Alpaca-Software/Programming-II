/*
 3. Un arquitecto necesita encontrar el área de un lote rectangular, 
revisa la fórmula con tus compañeros o en internet.
*/
package ejercicio3;
import java.util.*;
public class Main {
    
    public static void main(String[] args) {
        Scanner m = new Scanner (System.in);
        
        double ancho;
        double largo;
        
        System.out.print("Digite el ancho del lote: ");
        ancho=m.nextDouble();
        System.out.print("Digite el largo del lote: ");
        largo=m.nextDouble();
        
        Lote l = new Lote(ancho, largo);
        
        System.out.println("El area del lote es de: "+l.calcularArea()+"metros cuadrados");
    }
}
