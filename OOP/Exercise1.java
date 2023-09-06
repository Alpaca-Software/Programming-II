
// Exercise 1: Request a word by keyboard and display it on the screen letter
// by letter, using [ toCharArray() ].
//
// Ejercicio 1: Solicite una palabra mediante el teclado y muéstrela en la
// pantalla letra por letra, usando [ toCharArray() ].

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduzca una palabra: ");
		String word = sc.nextLine();

		System.out.println(); // Separator.

		new Word(word).printSlow();
	}
}

public class Word {
	String word;

	public Word(String word) {
		this.word = word;
	}

	public void printSlow() {
		char[] characters = this.word.toCharArray();

		for (char c : characters) {
			System.out.print(c);
		}
	}
}
