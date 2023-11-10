
/*
 Create a translator for three languages: Spanish, English and French.
 Now you must request a word and a language using the keyboard and show the
 corresponding translation.
*/

package partial.two.exercise25.variant2;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Introduzca una frase en español: ");

		String phrase = sc.nextLine();

		System.out.println("Inglés: " + Translator.translate(Translator.SPANISH, Translator.ENGLISH, phrase));
		System.out.println("Francés: " + Translator.translate(Translator.SPANISH, Translator.FRENCH, phrase));
	}
}
