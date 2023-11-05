

package coco77.exercise17;

import java.util.ArrayList;

/*
"17. Request a digit and a language by keyboard, send the two values to a method and display their value in words by console.
      Use two methods for both languages (Spanish and English)"
 */
public class Exercise17 {

    public static void main(String[] args) {
        ArrayList<Digit> digits= new ArrayList<>();
        
        digits.add(new Digit(9,"Spanish"));
        digits.add(new Digit(10,"Spanish"));
        digits.add(new Digit(7,"Spanish"));
        digits.add(new Digit(3,"Spanish"));
        digits.add(new Digit(4,"Spanish"));
        digits.add(new Digit(9,"English"));
        digits.add(new Digit(10,"English"));
        digits.add(new Digit(7,"English"));
        digits.add(new Digit(3,"English"));
        digits.add(new Digit(4,"English"));
        
        Digit.translateLenguageSpanisEnglish(digits);
        Digit.translateLenguageSpanish(digits);
        
    }
}
