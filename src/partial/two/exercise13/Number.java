package coco77.exercise13version1;

import java.util.ArrayList;

/* @author pinto*/
public class Number {

    private int number;
    public static int minDigit = 0;
    public static int maxDigit = 9;
    public static int digit = 0;
    public static int noDigit = 0;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public static int isDigit(ArrayList<Number> numbers) {

        for (Number n : numbers) {
            if (n.number >= Number.minDigit && n.number <= Number.maxDigit) {
                Number.digit++;
            }
        }

        return Number.digit;
    }

    public static int notIsDigit(ArrayList<Number> numbers) {

        for (Number n : numbers) {
            if (n.number < Number.minDigit || n.number > Number.maxDigit) {
                Number.noDigit++;
            }
        }

        return Number.noDigit;
    }

}
