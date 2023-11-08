
package coco77.exercise23;

import java.util.ArrayList;

/**
 *
 * @author pinto
 */


public class Number {
    
    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public static void calculateSustractIndex(ArrayList<Number> numbers){
        int c;
        int size = numbers.size();
        c = size/ 2;
        
        c = Math.round(c);
       Number numberSustract[] = new Number[3];
       
        for (int i = 0; i < size; i++) {
            numberSustract[0] = numbers.get(0);
            numberSustract[1] = numbers.get(c);
            numberSustract[2] = numbers.get(size-1);
        }
        
        int sum = 0;
        for (Number n : numberSustract) {
            sum += n.number;
        }
        
        
        System.out.println("La suma de los valores es de: "+sum);
        
    }
    
    
}
