
package javaapplicationtest;

public class Element {

    private String nameElement;
    private double price;
    public static final double ONE_DOLLAR = 1.0;
    public static double totalPriceProducto;
    public static double average;

    public Element(String nameElement, double price) {
        this.nameElement = nameElement;
        this.setPrice(price);
    }

    public String getNameElement() {
        return this.nameElement;
    }

    public void setNameElement(String nameElement) {
        this.nameElement = nameElement;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if (price < Element.ONE_DOLLAR) {
            this.price = Element.ONE_DOLLAR;
        } else {
            this.price = price;
        }
    }

    public static void getTotalPrice(Element[] elements) {
        for (Element e: elements) {
            Element.totalPriceProducto += e.getPrice();
        }
    }
    
    public static void getAverage(int sizeElemnt){
        average = totalPriceProducto/sizeElemnt;
    }
}
