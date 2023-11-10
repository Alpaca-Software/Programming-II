package coco77.exercise27;

import java.util.ArrayList;

public class Person {

    public static final int LEGAL_AGE = 18;
    private int age;
    private String name;
    public static int countPersonLegalAge=0;
    public static int countPersonMinorAge=0;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public static void showPersonLegalAndMinorAge(ArrayList<Person> persons){
        
        for (Person person : persons) {
            if(person.age >= Person.LEGAL_AGE){
                Person.countPersonLegalAge++;
            }else{
                Person.countPersonMinorAge++;
            }
        }
        
        System.out.println("La cantidad de personas que son mayores de edad son "+Person.countPersonLegalAge);
        
        System.out.println("La cantidad de personas que son menores de edad son "+Person.countPersonMinorAge);
        
    }
}
