package partial.two.exercise5;

import java.util.ArrayList;

/**
 * "5. You have a list of students with the following information: the name and a series of results
 * from the quizzes taken during the semester stored in an array. It is required to know the average
 * of the quizzes."
 */
public class Exercise5 {

  public static void main(String[] args) {
    ArrayList<Student> students = new ArrayList<>();

    students.add(new Student("felipe", 5.0f));
    students.add(new Student("Andrey", 4.0f));
    students.add(new Student("Pinto", 3.0f));
    students.add(new Student("Uribe", 5.0f));
    students.add(new Student("Johana", 5.0f));

    float average = Student.calculateAverage(students);

    System.out.println("the average the la store the quizzes is the: " + average);
  }
}
