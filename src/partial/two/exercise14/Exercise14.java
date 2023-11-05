
package partial.two.exercise14;

import java.util.ArrayList;

/*@author pinto77*/
public class Exercise14 {

    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        
        numbers.add(new Number(77));
        numbers.add(new Number(70));
        numbers.add(new Number(45));
        numbers.add(new Number(17));
        numbers.add(new Number(-3+4));
        
        double legalNumber = Number.calculateMaxNumber(numbers);
        double minorNumber = Number.calculateMinNumber(numbers);
        
        
        System.out.println("legal: "+legalNumber);
        System.out.println("Minor: "+minorNumber);
    }
}
