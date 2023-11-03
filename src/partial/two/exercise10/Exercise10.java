
package coco77.exercise10;

import java.util.ArrayList;

/* @author pinto
"10. Create a list of products with the following data: the name of the product, 
the IVA and the base price, send the list to a method and return a new list with the actual prices of the products, 
which means that I apply the IVA to the price base."

 */
public class Exercise10 {

    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();
        
        products.add(new Product("Leche",.19,5000));
        products.add(new Product("Huevos",.1,100000)); 
        products.add(new Product("carne",.19,20000));
        
        Product.calculateTotalPrice(products);
    }
}
