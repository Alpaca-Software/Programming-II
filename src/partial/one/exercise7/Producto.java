package partial.one.exercise7;

public class Producto {

  private String nameProduct;
  private double iva;
  private double basePrice;
  public static double salesTotal = 0;
  public static double total;

  public Producto(String nameProduct, double iva, double basePrice) {
    this.nameProduct = nameProduct;
    this.iva = iva;
    this.basePrice = basePrice;
  }

  public Producto() {}

  public String getNameProduct() {
    return nameProduct;
  }

  public void setNameProduct(String nameProduct) {
    this.nameProduct = nameProduct;
  }

  public double getIva() {
    return iva;
  }

  public void setIva(double iva) {
    this.iva = iva;
  }

  public double getBasePrice() {
    return basePrice;
  }

  public void setBasePrice(double basePrice) {
    this.basePrice = basePrice;
  }

  public static void calculatePriceTotal(Producto[] producto) {

    for (Producto p : producto) {
      total = ((p.getIva() * p.getBasePrice()) / 100) + p.getBasePrice();
      salesTotal += total;
      System.out.println("the price the producu " + p.nameProduct + " is the " + total);
    }

    System.out.println("The total sales is the: " + salesTotal);
  }
}
