package ejercicio2.pkg1;

/**
 *
 * 2. Ellos le proporcionan dos valores de un lote para encontrar el área, hay dos tipos de figuras, un rectángulo y un triángulo.	
 */

import java.util.Scanner;

public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Area de un lote");
        
        
        System.out.print("Input the base del triangulo ");
        float baseTriangulo = sc.nextFloat();
        
        
        System.out.print("Input the higth del triangulo ");
        float alturaTriangulo = sc.nextFloat();
        
       
        

        System.out.print("Input the base del rectangulo ");
        float baseRectangulo = sc.nextFloat();
        
        System.out.print("Input the altura del rectangulo ");
        float alturaRectangulo = sc.nextFloat();
        
        
        //calcular area triangulo
        
        float areaTriangulo = (alturaTriangulo*baseTriangulo)/2;
        float areaRectangulo = alturaRectangulo*alturaRectangulo;
        
        float areaLote = areaTriangulo+areaRectangulo;
        
        System.out.println("areaLote = " + areaLote);
        
        
        
    }
    
}
