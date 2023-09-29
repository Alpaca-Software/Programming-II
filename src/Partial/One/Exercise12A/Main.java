
/* 
12. Request a digit by keyboard and display its value in words by console. The user can select the language for the word, 
    allowing you to select between English and Spanish.
 */
package Partial.One.Exercise12A;

public class Main {

    public static void main(String[] args) {
        int digit = 3;
        boolean isEnglish = true;

        String name;
        if (isEnglish) {
            name = new Digit(digit).showEnglishName();
        } else {
            name = new Digit(digit).showSpanishName();
        }

        System.out.printf("The name of digit %d is %s.\n", digit, name);
    }
}
