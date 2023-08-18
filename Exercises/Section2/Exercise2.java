// Topic: CONTROL STRUCTURES - Estructuras de Control.

// Exercise 2: They provide you with two values 
//             of a lot to find the area, there 
//             are two types of figures, a
//             rectangle and a triangle.	
//
//             Ellos le proporcionan dos valores 
//             de un lote para encontrar el área, 
//             hay dos tipos de figuras, un 
//             rectángulo y un triángulo.

import java.util.Scanner;

public class Figures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Rectangle Area.
        System.out.print("Introduzca las dimensiones del rectángulo (metros):\n");
        
        System.out.print("  Largo del rectángulo: ");
        float rectLength = sc.nextFloat();
        
        System.out.print("  Ancho del rectángulo: ");
        float rectWidth = sc.nextFloat();
        
        float areaRect = rectLength*rectWidth;
        System.out.printf("  Área: %.1f metros.", areaRect);
        
        // Triangle Area.
        System.out.print("\n\nIntroduzca las dimensiones del triángulo (metros):\n");
        
        System.out.print("  Base del triángulo: ");
        float triangleBase = sc.nextFloat();
        
        System.out.print("  Altura del triángulo: ");
        float triangleHeight = sc.nextFloat();
        
        float areaTriangle = triangleBase * triangleHeight / 2;
        System.out.printf("  Área: %.1f metros.", areaTriangle);

        
        System.out.printf("\n\n Área del lote: %.1f m²", areaRect + areaTriangle);
    }
}
