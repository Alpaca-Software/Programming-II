
package partial.two.exercise9;

import java.util.ArrayList;

/* @author pinto */
public class Currency {
    private double amountOfMoney;
    private String currency;
    public static double pesosColombiano=0;

    public Currency(double amountOfMoney, String currency) {
        this.amountOfMoney = amountOfMoney;
        this.currency = currency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setAmountOfMoney(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }
    
    public static void showCurrencyConvert(ArrayList<Currency> currency){
        
        for (Currency m : currency) {
            if(m.currency.equalsIgnoreCase("dollars")){
                Currency.pesosColombiano = convertDollars(m.amountOfMoney);
                System.out.println("la conversion de "+m.amountOfMoney+" dolares a pesos colombianos es de: "+Currency.pesosColombiano);
            }else if(m.currency.equalsIgnoreCase("euros")){
                Currency.pesosColombiano = convertEuros(m.amountOfMoney);
                 System.out.println("la conversion de "+m.amountOfMoney+" euros a pesos colombianos es de: "+Currency.pesosColombiano);
            }else{
                System.out.println("Esta moneda no es valida para convertir");
            }
        }
    }
    
    public static double convertDollars(double amountOfMoney){
        double pesos = amountOfMoney; 
        pesos *=4;
        return pesos;
    }
    
    
    public static double convertEuros(double amountOfMoney){
        double pesos = amountOfMoney;
        pesos *=5;
        return pesos;
    }
}
