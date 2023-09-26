package PartialOne.ExerciseThree;

/*"3. An architect has a list of lots:
the data of the lots is as follows: figure type
      (TRIANGLE, RECTANGLE, SQUARE),
the base and the height. The total surface area of the lots is needed."*/
public class Main {

  public static void main(String[] args) {
    float baseTriangle = 5;
    float heightTriangle = 7;

    float baseRectangle = 7;
    float heightRectangle = 7;

    float sideSquare = 7;

    Area area = new Area(baseTriangle, heightTriangle, baseRectangle, heightRectangle, sideSquare);
    area.calculateAreaTotal();
  }
}
