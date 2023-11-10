package partial.two.exercise25.variant1;

/*
"25. Create a translator for three languages:
Spanish, English and French.
      Now you must request a word and a language using
the keyboard and show the corresponding translation."

"25. Crear un traductor para tres idiomas: español, inglés y francés.
       Ahora deberás solicitar una palabra
y un idioma mediante el teclado y mostrar la traducción correspondiente."

*/
import java.util.*;

public class Exercise25 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ingresa la palabra a traducir: ");
    String word = sc.next();

    System.out.print("Ingresa el idioma que quieres traducir: ");
    String languague = sc.next();

    Translator word1 = new Translator(word, languague);

    word1.calculateTranslate();
  }
}
