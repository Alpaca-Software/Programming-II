package partial.two.exercise31;

import java.util.ArrayList;
import java.util.List;

public class Color {
  private String color;

  public Color(String color) {
    this.color = color;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public static List calculateColor(ArrayList<Color> colors, String colorB) {

    int size = colors.size();

    for (int i = 0; i < size; i++) {
      if (colors.get(i).color.equalsIgnoreCase(colorB)) {

        colors.set(i, new Color("purple"));
      }
    }

    return colors;
  }
}
