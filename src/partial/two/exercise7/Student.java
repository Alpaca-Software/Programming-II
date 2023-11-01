
package partial.two.exercise7;

import java.util.List;
import java.util.ArrayList;
public class Student {
    private String name;
    private float partialOne;
    private float partialTwo;
    private float quizzes;
    private float finalExamen;
    public static float finalNote = 0.0f;
    public static final float minimunGrade = 3.0f;

    public Student(String name, float partialOne, float partialTwo, float quizzes, float finalExamen) {
        this.name = name;
        this.partialOne = partialOne;
        this.partialTwo = partialTwo;
        this.quizzes = quizzes;
        this.finalExamen = finalExamen;
    }

    public float getFinalExamen() {
        return finalExamen;
    }

    public void setFinalExamen(float finalExamen) {
        this.finalExamen = finalExamen;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPartialOne() {
        return partialOne;
    }

    public void setPartialOne(float partialOne) {
        this.partialOne = partialOne;
    }

    public float getPartialTwo() {
        return partialTwo;
    }

    public void setPartialTwo(float partialTwo) {
        this.partialTwo = partialTwo;
    }

    public float getQuizzes() {
        return quizzes;
    }

    public void setQuizzes(float quizzes) {
        this.quizzes = quizzes;
    }
    
    public static void checkIfItPassed(List<Student> students){
        
        for (Student e : students) {
            finalNote = 0.0f;
            finalNote = e.quizzes+e.partialOne+e.partialTwo;
            finalNote /=3;
            finalNote *=.7;
            finalNote += (e.finalExamen*0.3);
            
            
            if(finalNote >=minimunGrade){
                System.out.println("the student "+e.name+" aprovó la asignatura con una nota de: "+finalNote);
            }else{
                System.out.println("the student "+e.name+" no aprovó la asignatura"+finalNote);
            }
        }
    }
    
    
            
}
