package coco77.exercise28;

import java.util.ArrayList;

/*
"28. Save numbers in a list, now you must iterate and find the first prime
number, when you find it you must stop the loop and display the prime
number in the console."

"28. Guarda números en una lista, ahora debes iterar y encontrar el primer
número primo, cuando lo encuentres debes detener el ciclo y mostrar el primo.
número en la consola."

//En matemáticas, un número primo es un número natural mayor que 1
que tiene únicamente dos divisores positivos distintos: él mismo y el 1


            if (number.number > 1) {
                c = 0;

               for (int i = 2; i*i <= number.number; i ++) {
                    if (number.number % i == 0){
                        c++;
                        break;
                    }
                }

                if (c == 0) {
                System.out.println("El primer numero primo es: " + number.number);
                break;
                }
            }

 */
public class Exercise28 {

  public static void main(String[] args) {
    ArrayList<Number> numbers = new ArrayList<>();

    numbers.add(new Number(7));
    numbers.add(new Number(1));
    numbers.add(new Number(4));
    numbers.add(new Number(15));
    numbers.add(new Number(3));
    numbers.add(new Number(6));

    Number.calculateFirsNumberPrime(numbers);
  }
}
