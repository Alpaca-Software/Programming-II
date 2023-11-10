package partial.two.exercise25.variant1;

public class Translator {
  public static final String LANGUAGES[] = {"French", "Spanish", "English"};
  public static final String LANGUAGE_FRENCH[] = {"Femme", "Chat", "file"};
  public static final String LANGUAGE_SPANISH[] = {"Mujer", "Gato", "chica"};
  public static final String LANGUAGE_ENGLISH[] = {"Women", "cat", "girl"};

  private String word;
  private String languague;

  public Translator(String word, String languague) {
    this.word = word;
    this.languague = languague;
  }

  public String getLanguague() {
    return languague;
  }

  public void setLanguague(String languague) {
    this.languague = languague;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public void calculateTranslate() {

    if (this.languague.equalsIgnoreCase(Translator.LANGUAGES[0])) {
      for (String l : LANGUAGE_FRENCH) {
        if (this.word.equalsIgnoreCase(l)) {}
      }
    } else if (this.languague.equalsIgnoreCase(Translator.LANGUAGES[1])) {
      for (String l : LANGUAGE_SPANISH) {
        if (this.word.equalsIgnoreCase(l)) {
          System.out.println("l = " + l);
        }
      }
    } else if (this.languague.equalsIgnoreCase(Translator.LANGUAGES[2])) {
      for (String l : LANGUAGE_ENGLISH) {
        if (this.word.equalsIgnoreCase(l)) {
          System.out.println("l = " + l);
        }
      }
    } else {
      System.out.println("La palabra no se puede traducir  ");
    }
  }
}
