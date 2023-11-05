package partial.two.exercise17;

import java.util.ArrayList;

public class Digit {

    private int digit;
    private String lenguage;
    public static String digitEnglish[] = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    public static String digitSpanish[] = {"cero", "uno", "dos", "tres", "cuatro", "cinco", "seis", "siete", "ocho", "nueve"};

    public Digit(int digit, String lenguage) {
        this.digit = digit;
        this.lenguage = lenguage;
    }

    public String getLenguage() {
        return lenguage;
    }

    public void setLenguage(String lenguage) {
        this.lenguage = lenguage;
    }

    public int getDigit() {
        return digit;
    }

    public void setDigit(int digit) {
        this.digit = digit;
    }

    public static void translateLenguageSpanish(ArrayList<Digit> digits) {
        int sizeArray = digits.size();
        int translate;
        for (int i = 0; i < sizeArray; i++) {
            if ((digits.get(i).digit >=0 && digits.get(i).digit <=9)) {
                translate = digits.get(i).digit;
                if (digits.get(i).lenguage.equalsIgnoreCase("Spanish")) {
                    System.out.println("traducion del digito "+translate+" es "+Digit.digitSpanish[translate]);
                
                }
            }
        }

    }

    public static void translateLenguageSpanisEnglish(ArrayList<Digit> digits) {
        int translate;
        
        
        int sizeArray = digits.size();
         for (int i = 0; i < sizeArray; i++) {
            if ((digits.get(i).digit >=0 && digits.get(i).digit <=9)) {
                translate = digits.get(i).digit;
                 if (digits.get(i).lenguage.equalsIgnoreCase("English")){
                System.out.println("traducion del digito "+translate+" es "+Digit.digitEnglish[translate]);
                }
            }
        }
       
    }
}
