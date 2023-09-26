package PartialOne.ExerciseThree;

/**
 * @author pinto
 */
public class Area {
  float baseTriangle;
  float heightTriangle;
  float baseRectangle;
  float height;
  float sideSquare;

  public Area(
      float baseTriangle,
      float heightTriangle,
      float baseRectangle,
      float height,
      float sideSquare) {
    this.baseTriangle = baseTriangle;
    this.heightTriangle = heightTriangle;
    this.baseRectangle = baseRectangle;
    this.height = height;
    this.sideSquare = sideSquare;
  }

  public float calculateAreaTriangle() {
    float areaTriangle = (this.heightTriangle * this.baseTriangle) / 2;
    System.out.println("areaTriangle = " + areaTriangle);
    return areaTriangle;
  }

  public float calculateAreaRectangle() {
    float areaRectangule = this.baseRectangle * this.height;
    System.out.println("areaRectangule = " + areaRectangule);
    return areaRectangule;
  }

  public float calculateAreaSquare() {
    float areaSquare = (float) Math.pow(this.sideSquare, 2);
    System.out.println("areaSquare = " + areaSquare);
    return areaSquare;
  }

  public void calculateAreaTotal() {
    float surfaceArea;

    surfaceArea = calculateAreaRectangle() + calculateAreaSquare() + calculateAreaTriangle();
    System.out.println("surfaceArea = " + surfaceArea + " m´2");
  }
}
