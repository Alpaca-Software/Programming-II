
package coco77.exercise33;

import java.util.ArrayList;

/*
"33. You have a list of t-shirt sizes, 
now you must request the numerical size 
by keyboard, but you must show the size 
in letters, that is, size 16 is S, 
the same for the other sizes."

"33. Tienes una lista de tallas de camiseta, 
ahora debes solicitar la talla numérica por teclado,
pero debes mostrar la talla en letras, es decir, la talla 16 es S,
      Lo mismo para los otros tamaños."

// s = 16, 18= m, 20 = L  
 */
public class Exercise33 {

    public static void main(String[] args) {
        
        Size size1 = new Size(21);
        
        String sizeLetter = size1.calculateSizeShrit();
        
        System.out.println("sizeLetter = " + sizeLetter);
    }
}
