
package Inheritance.Example.Hospital1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;


public class Person {
    
    protected String document;
    protected String name1;
    protected String name2 ;
    protected String surname1;
    protected String surname2;
    protected LocalDate birthDay ;

    public Person(String document, String name1, String name2, String surname1, String surname2, String birthDay) {
        this.document = document;
        this.name1 = name1;
        this.name2 = name2;
        this.surname1 = surname1;
        this.surname2 = surname2;
        this.setBirthDay(birthDay);
    }
    
    public void isThirAge(){
      
    } 
    
    
    
 
    
    /**
     * @return the document
     */
    public String getDocument() {
        return document;
    }

    /**
     * @param document the document to set
     */
    public void setDocument(String document) {
        this.document = document;
    }

    /**
     * @return the name1
     */
    public String getName1() {
        return name1;
    }

    /**
     * @param name1 the name1 to set
     */
    public void setName1(String name1) {
        this.name1 = name1;
    }

    /**
     * @return the name2
     */
    public String getName2() {
        return name2;
    }

    /**
     * @param name2 the name2 to set
     */
    public void setName2(String name2) {
        this.name2 = name2;
    }

    /**
     * @return the surname1
     */
    public String getSurname1() {
        return surname1;
    }

    /**
     * @param surname1 the surname1 to set
     */
    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    /**
     * @return the surname2
     */
    public String getSurname2() {
        return surname2;
    }

    /**
     * @param surname2 the surname2 to set
     */
    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    /**
     * @return the birthDay
     */
    public LocalDate getBirthDay() {
        
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(String birthDay) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        this.birthDay = LocalDate.parse(birthDay,formatter);
    }

    public int getAge(){
        return (int) ChronoUnit.YEARS.between(birthDay,LocalDate.now());
    }

    @Override
    public String toString() {
       return "holaaaaaaaaaaaaaaaa";
             
    }
    
    
}
