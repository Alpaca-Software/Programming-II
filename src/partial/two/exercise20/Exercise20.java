package partial.two.exercise20;

import java.util.Scanner;

/*
20. Request a word using the keyboard, display the same word with the first and last letter capitalized.

20. Solicite una palabra usando el teclado, muestre la misma palabra con la primera y la última letra en mayúscula.

 */
public class Exercise20 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String word = sc.next();
        
        Word word1 = new Word(word);
        
        word1.showWordUpperCase();
    }
}
