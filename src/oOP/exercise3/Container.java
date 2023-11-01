package oOP.exercise3;

public class Container {
  public String text, word;

  public Container(String text, String word) {
    this.text = text.toLowerCase();
    this.word = word.toLowerCase();
  }

  public void veryText() {
    boolean e = true;

    e = text.contains(word);

    if (e) {
      System.out.println("if exists the word!! ");
    } else {
      System.out.println("not exists tha word!!");
    }
  }
}
