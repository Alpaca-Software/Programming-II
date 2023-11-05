package partial.two.exercise8;

import java.util.ArrayList;

/* @author pinto*/
public class Person {
    private String name;
    private String document;
    private int age;
    public static float ageAvererage = 0;

    public Person(String name, String document, int age) {
        this.name = name;
        this.document = document;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
    
    public static float averageAge(ArrayList<Person> people){
        
        int sizeList = people.size();
        
        for (Person p : people) {
            Person.ageAvererage += p.age;
        }
        
        Person.ageAvererage /= sizeList;
        
        return Person.ageAvererage;
    }
    
}
