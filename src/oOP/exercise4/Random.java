package oOP.exercise4;

public class Random {
  public int number;

  public Random(int number) {
    this.number = number;
  }

  public void veryRandom() {
    int c = 0;

    if (number > 0 && number <= 20) {

      for (int i = 0; i < number; i++) {
        int numberOne = (int) (Math.random() * number + 1);

        if (numberOne == number) {
          c++;
        }
        System.out.println(numberOne);
      }

    } else {
      System.out.println("The number must be greater than 0 and less than or equal to 20");
    }

    System.out.println("The number fue encontrado " + c + " veces");
  }
}
