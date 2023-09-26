
package Partial.One.Exercise10;

public class Integer {
  int number;

  public Integer(int number) {
	this.number = number;
  }

  public boolean isDigit() {
  	return this.number >= 0 && this.number <= 9;
  }

  public static int countDigits(Integer[] integers) {
	int digits = 0;
	for (Integer i: integers) {
	  if (i.isDigit()) {
		digits++;
	  }
	}

	return digits;
  }
}
