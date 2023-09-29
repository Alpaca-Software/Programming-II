
/* 
12. Request a digit by keyboard and display its value in words by console. The user can select the language for the word, 
    allowing you to select between English and Spanish.
 */
package Partial.One.Exercise12A;

public class Main {

    public static void main(String[] args) {
        int input = 5;
        boolean isEnglish = false;

        String name;
        if (isEnglish) {
            name = new Digit(input).showEnglishName();
        } else {
            name = new Digit(input).showSpanishName();
        }

        System.out.printf("The name of digit %d is %s.\n", input, name);
    }
}
