package Partial.Two.Exercise4;

import java.util.List;

public class Area {
  private float base;
  private float height;
  public static float sumAreas = 0;

  public Area(float base, float height) {
    this.base = base;
    this.height = height;
  }

  public float getHeight() {
    return height;
  }

  public void setHeight(float height) {
    this.height = height;
  }

  public float getBase() {
    return base;
  }

  public void setBase(float base) {
    this.base = base;
  }

  public static float calculateSumOfAreas(List<Area> areas) {

    for (Object a : areas) {}

    return sumAreas;
  }
}
