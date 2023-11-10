package coco77.exercise28;

import java.util.ArrayList;

public class Number {

    private int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static void calculateFirsNumberPrime(ArrayList<Number> numbers) {
        int c = 0;
        for (Number number : numbers) {
            
            if(number.number > 1){
                c =0;
                for (int i = 2; i*i <= number.number; i++) {
                    if(number.number%i==0){
                        break;
                    }

                }

                  if(c==0){
                        System.out.println("primer numero primo es: "+number.number);
                        break;
                    }
            }
            
            

        }

    }

}
