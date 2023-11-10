package partial.two.exercise25.variant2;

import java.util.Arrays;

public class Translator {

	final static String[] SPANISH = {
			"a",
			"como",
			"dormir",
			"esta",
			"gusta",
			"hola",
			"me",
			"mi",
			"soy",
			"yo", };

	final static String[] ENGLISH = {
			"to",
			"how are",
			"sleep",
			"this",
			"like",
			"hello",
			"me",
			"my",
			"am",
			"I", };

	final static String[] FRENCH = {
			"a",
			"comme",
			"sommeil",
			"ceci",
			"gusta",
			"bonjour",
			"je",
			"mon",
			"je suis",
			"moi", };

	public static String translate(String[] src, String[] dest, String phrase) {
		String[] words = phrase.trim().split(" ");

		for (int i = 0; i < words.length; i++) {
			if (!Arrays.asList(src).contains(words[i].toLowerCase())) {
				continue;
			}

			words[i] = dest[Arrays.asList(src).indexOf(words[i])];
		}

		return String.join(" ", words);
	}
}
