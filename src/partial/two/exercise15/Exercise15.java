

package partial.two.exercise15;

// pinto77
/*"15. From the previous exercise, you must create 
two methods that, upon receiving the values from 
the list of numbers, verify the even and odd numbers. 
      Show the total of even and odd numbers."*/
import java.util.ArrayList;
public class Exercise15 {

    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();
        
        numbers.add(new Number(77));
        numbers.add(new Number(7));
        numbers.add(new Number(0));
        numbers.add(new Number(2));
        numbers.add(new Number(80));
        numbers.add(new Number(3));
        numbers.add(new Number(4));
        
        int oddNumber = Number.calculateNumbersOdd(numbers);
        System.out.println("oddNumber = " + oddNumber);
        int peerNumber = Number.calculateNumbersPeers(numbers);
        System.out.println("peerNumber = " + peerNumber);
        
    }
}
