package partial.two.exercise21;


public class Vowel {

  public static final String VOWELS_LOWERCASE[] = {"a", "e", "i", "o", "u"};
  public static final String VOWELS_UPPER_CASE[] = {"A", "E", "I", "O", "U"};

  private String vowel;

  public Vowel(String vowel) {
    this.vowel = vowel;
  }

  public String getVowel() {
    return vowel;
  }

  public void setVowel(String vowel) {
    this.vowel = vowel;
  }

  public void showIfIsVowel() {
    boolean lower = true;
    boolean upper = true;

    for (String v : VOWELS_LOWERCASE) {
      if (this.vowel.equals(v)) {
        System.out.println("Es vocal minuscula ");
        break;
      } else {
        lower = false;
      }
    }

    for (String v : VOWELS_UPPER_CASE) {
      if (this.vowel.equals(v)) {
        System.out.println("Es vocal Mayuscula ");
        break;
      } else {
        upper = false;
      }
    }

    if (!lower && !upper) {
      System.out.println("No es vocal");
    }
  }
}
