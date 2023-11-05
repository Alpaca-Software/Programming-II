
package partial.two.exercise9;

import java.util.ArrayList;

/* @author pinto
"9. Create a list with the following data: an amount of money and the type of currency 
(dollars and euros), through a method to convert the values into Colombian pesos, 
    and display the total amount of money collected in Colombian pesos on the console. Use two methods."
*/
public class Exercise9 {

    public static void main(String[] args) {
        ArrayList<Currency> currencys = new ArrayList<>();
        
        currencys.add(new Currency(1000,"dollars"));
        currencys.add(new Currency(1000,"euros"));
        currencys.add(new Currency(5000,"dollars"));
        currencys.add(new Currency(20000,"euros"));
        
        Currency.showCurrencyConvert(currencys);
    }
}
