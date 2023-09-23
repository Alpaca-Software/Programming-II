
package coco77.partial6;

/*"6. Desarrollar un sistema monetario, al ingresar
una cantidad de dólares o euros debo obtener su valor 
en pesos colombianos.
     Debes crear una lista con los siguientes datos: 
el tipo de moneda y el valor."

"6. Develop a monetary system, when entering an amount 
of dollars or euros I must obtain its value in Colombian pesos.
You must create a list with the following data: 
the type of currency and the value."
*/
public class Partial6 {

    public static void main(String[] args) {
        
        Currency currency[] = new Currency[4];
        
        currency[0] = new Currency("euro",200);
        currency[1] = new Currency("dollar",900);
        currency[2] = new Currency("dollar",390);
        currency[3] = new Currency("euro",420);
        
        
        Currency.calculateCurrencyConversion(currency);
        
    }
}
