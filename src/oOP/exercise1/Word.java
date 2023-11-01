package OOP.Exercise1;

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
