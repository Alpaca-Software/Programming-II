package oop.exercise7;

/** show greater */
public class Greater {
  float numberOne, numberTwo;

  public Greater(float numberOne, float numberTwo) {
    this.numberOne = numberOne;
    this.numberTwo = numberTwo;
  }

  public float calculateGreater() {

    float greater;

    if (this.numberOne > this.numberTwo) {
      greater = this.numberOne;
    } else {
      greater = this.numberTwo;
    }

    return greater;
  }
}
