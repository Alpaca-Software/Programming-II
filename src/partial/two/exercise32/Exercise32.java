package coco77.exercise32;

import java.util.ArrayList;

/* 32. Almacena números enteros 
en una lista, debes sumar las posiciones 
impares, muestra el total por consola.
 */
public class Exercise32 {

    public static void main(String[] args) {
        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(new Number(7)); //7
        numbers.add(new Number(2));
        numbers.add(new Number(4));//11
        numbers.add(new Number(9));
        numbers.add(new Number(4));//15
        numbers.add(new Number(4));
        numbers.add(new Number(5));//20
        numbers.add(new Number(4));
        numbers.add(new Number(10));//30
        numbers.add(new Number(3));
        numbers.add(new Number(47));//77

        Number.calculateDisplayNumbers(numbers);
    }
}
