package OOP.Exercise3;

/**
 * "3. Store a text in a variable and request a word by keyboard and look for it in the text, report
 * if it exists. [ contains ]"
 *
 * <p>"3. Almacenar un texto en una variable y solicitar una palabra por teclado y buscarla en el
 * texto, informar si existe. [contiene]"
 */
import java.util.*;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a text: ");
    String text = sc.nextLine();

    System.out.print("Enter a word: ");
    String work = sc.nextLine();

    Container string = new Container(text, work);

    string.veryText();
  }
}
