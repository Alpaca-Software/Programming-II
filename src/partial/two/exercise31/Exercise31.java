package partial.two.exercise31;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*31. Store colors in a list, now it will ask for a color by
keyboard and check if it exists in the initial list, if it finds it,
change it to another color, print the new list since the main method.

31. Almacena colores en una lista, ahora te pedirá un
color por teclado y comprobará si existe en la lista
inicial, si lo encuentra lo cambia a otro color,
imprime la nueva lista desde el método principal.
*/
public class Exercise31 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    ArrayList<Color> colors = new ArrayList<>();

    colors.add(new Color("green"));
    colors.add(new Color("blue"));
    colors.add(new Color("purple"));
    colors.add(new Color("black"));
    colors.add(new Color("white"));

    String colorB = sc.nextLine();

    List<Color> newList = Color.calculateColor(colors, colorB);

    for (Color color : newList) {
      System.out.println("color = " + color.getColor());
    }
  }
}
