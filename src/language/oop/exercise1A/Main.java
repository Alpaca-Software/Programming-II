package language.oop.exercise1A;

/*1. Solicite una palabra mediante el teclado y muéstrela en la pantalla letra por letra, usando [ toCharArray() ]
 1. Request a word by keyboard and display it on the screen letter by letter, using [ toCharArray() ]
*/
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a word: ");
    String word = sc.nextLine();

    Word character = new Word(word);

    character.veryWord();
  }
}
