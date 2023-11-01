package language.oop.exercise6;

public class Area {
  float height, base;

  public Area(float base, float height) {
    this.height = height;
    this.base = base;
  }

  public void calculateArea() {
    System.out.println("the area the batch is: " + this.base * this.height);
  }

  public String calculatePerimeter() {
    float sideOne = this.base * 2;
    float sideTwo = this.height * 2;

    float perimeter = sideOne + sideTwo;

    System.out.println("the perimeter the batch is: " + perimeter);
    String name = "felipe77";
    return name;
  }
}
