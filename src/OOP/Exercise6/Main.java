package OOP.Exercise6;

/*
"6. Desarrollar una aplicación que calcule el área y perímetro de un lote rectangular, las dimensiones son propuestas por usted,
       recuerda que debes crear métodos que realicen el cálculo"
 */
import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter the base: ");
    float base = sc.nextInt();
    System.out.print("Enter the height: ");
    float height = sc.nextInt();

    Area area = new Area(base, height);
    area.calculateArea();
    String name = area.calculatePerimeter();

    System.out.println(name);
  }
}
