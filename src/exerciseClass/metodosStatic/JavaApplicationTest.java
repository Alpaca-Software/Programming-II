package exerciseClass.metodosStatic;

/*
venta

nombre = mesa;
precio = 5;

5 objetos

vender

big and small

lista

*/

public class JavaApplicationTest {

  public static void main(String[] args) {

    Element elements[] = new Element[3];

    elements[0] = new Element("mesa", 0.50);
    elements[1] = new Element("ventilador", 30);
    elements[2] = new Element("computador", 50);

    Element.getTotalPrice(elements);

    System.out.println("Ganancia Total: " + Element.totalPriceProducto);

    Element.getAverage(elements.length);
    System.out.println("El promedio de la ganacia es de: " + Element.average);
  }
}
