package partial.one.exercise7;

/**
 * "7. You must create a list of products with the following data: the name of the product, the IVA
 * and the base price. Now you must calculate the real sale price and display the total sales for
 * the day on the console."
 */
public class Exercise7 {

  public static void main(String[] args) {

    Producto producto[] = new Producto[4];

    producto[0] = new Producto("aceite", 19, 30000);
    producto[1] = new Producto("Atún", 19, 30000);
    producto[2] = new Producto("rice", 19, 30000);
    producto[3] = new Producto("papas", 19, 30000);

    Producto.calculatePriceTotal(producto);
  }
}
