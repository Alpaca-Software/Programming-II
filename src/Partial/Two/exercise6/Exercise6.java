package Partial.Two.exercise6;

import java.util.ArrayList;
import java.util.List;
/* @author Coco77

6. Add the following data to the object of the previous list, the score of the first and second partial, you want to know the 70 percent.
 */
import java.util.List;

public class Exercise6 {

  public static void main(String[] args) {
    List<Student> students = new ArrayList<>();

    students.add(new Student("felipe", 5.0f, 4.8f, 5.0f));
    students.add(new Student("ponto", 3.0f, 1.8f, 4.0f));
    students.add(new Student("Johana", 5.0f, 4.8f, 5.0f));
    students.add(new Student("pinto", 5.0f, 5.0f, 5.0f));

    List notas = Student.calculate70Persent(students);

    int c = notas.size();

    for (int i = 0; i < c; i++) {}
  }
}
