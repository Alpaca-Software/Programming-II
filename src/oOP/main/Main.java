package oOP.main;

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter a word: ");
    String word = sc.nextLine();

    Container wordLarge = new Container(word);

    wordLarge.veryWord();
  }
}
