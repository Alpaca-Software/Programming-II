package coco77.exercise10;

import java.util.ArrayList;

/**
 *
 * @author pinto
 */
public class Product {
    private String nameProduct;
    private double iva;
    private double priceProduct;
    public static double totalPrice = 0;

    public Product(String nameProduct, double iva, double priceProduct) {
        this.nameProduct = nameProduct;
        this.iva = iva;
        this.priceProduct = priceProduct;
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = priceProduct;
    }

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
    
    public static void calculateTotalPrice(ArrayList<Product> products){
        for (Product p : products) {
            Product.totalPrice = (p.priceProduct*p.iva)+p.priceProduct;
            System.out.println("para el producto "+p.nameProduct+" el precio total es de: "+Product.totalPrice);
        }
    }
}
