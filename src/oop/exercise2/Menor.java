package oop.exercise2;

public class Menor {
  public int numberOne, numberTwo;

  public Menor(int numberOne, int numberTwo) {
    this.numberOne = numberOne;
    this.numberTwo = numberTwo;
  }

  public void showLesser() {
    if (numberOne < numberTwo) {
      System.out.print("The number lesser is: " + numberOne);
    } else {
      System.out.println("The number lesser is: " + numberTwo);
    }
  }
}
