
package coco77.exercise28;

public class Age {
    
    private int age;
  
    public final static int LEGAL = 18;

    public Age(int age) {
        this.age = age;
    }
   
    
    
    public static int calculateLegal(Age age[]){
        int legal = 0;
        for (Age e : age) {
            if(e.age>=LEGAL){
                legal++;
            }
        }
       return legal;
    }
    
    public static int calculateMinior(Age age[]){
         int minor =0;
         for (Age e : age) {
            if(e.age<LEGAL){
                minor++;
            }
        }
         
        return minor;
    }
    
    public static void Ageclassification(int legal, int minior){
        System.out.println("minior = " + minior);
        System.out.println("legal = " + legal);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
    
    
}
