package Partial.Two.Exercise4;

import java.util.ArrayList;
import java.util.List;

/*"4. An architect has a list of lots: the data of the lots are the following: type of figure (RECTANGLE and SQUARE), the base and the height.
The sum of the areas of the lots is needed."*/
public class main {
  public static void main(String[] args) {

    List<Area> areas = new ArrayList<>();

    areas.add(new Area(10f, 10f));
    areas.add(new Area(10f, 10f));
    areas.add(new Area(10f, 10f));
    areas.add(new Area(10f, 10f));

    float sum = 0;
    sum = Area.calculateSumOfAreas((ArrayList<Area>) areas);
    System.out.println("la suma de los lotes es de: "+sum);
  }
}
