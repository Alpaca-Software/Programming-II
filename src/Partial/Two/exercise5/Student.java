package coco77.exercise5;

import java.util.List;

public class Student {
    private String name;
    private float quiz;

    public Student(String name, float quiz) {
        this.name = name;
        this.quiz = quiz;
    }

    public float getQuiz() {
        return quiz;
    }

    public void setQuiz(float quiz) {
        this.quiz = quiz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public static float calculateAverage(List<Student> students){
        float average = 0.0f;
        
        for (Student e : students) {
            average += e.quiz; 
        }
        
        average /= students.size();
        
        return average;
    }
    
    
}
