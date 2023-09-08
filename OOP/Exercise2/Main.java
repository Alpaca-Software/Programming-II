
package Exercise2;

/**
 2. Solicite dos números por teclado y muestre el menor de los dos
 2. Request two numbers by keyboard, and show the lesser of the two

 */
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number One: ");
        int numberOne = sc.nextInt();
        
        System.out.print("Enter the number Two: ");
        int numberTwo = sc.nextInt();
        
        Menor lesser = new Menor(numberOne,numberTwo);
        
        lesser.showLesser();
    }
}
