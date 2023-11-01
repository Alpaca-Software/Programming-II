package Partial.Two.exercise6;

import java.util.ArrayList;
import java.util.List;

public class Student {
  private String name;
  private float quizzes;
  private float partialOne;
  private float partialTwo;

  public Student(String name, float quizzes, float partialOne, float partialTwo) {
    this.setName(name);
    this.setQuizzes(quizzes);
    this.setPartialOne(partialOne);
    this.setPartialTwo(partialTwo);
  }

  public float getPartialTwo() {
    return partialTwo;
  }

  public void setPartialTwo(float partialTwo) {
    this.partialTwo = partialTwo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getQuizzes() {
    return quizzes;
  }

  public void setQuizzes(float quizzes) {
    this.quizzes = quizzes;
  }

  public float getPartialOne() {
    return partialOne;
  }

  public void setPartialOne(float partialOne) {
    this.partialOne = partialOne;
  }

  public static List calculate70Persent(List<Student> students) {
    List<Float> notes = new ArrayList<>();

    float noteStudent = 0.0f;

    for (Student e : students) {
      noteStudent = 0.0f;

      noteStudent += e.quizzes + e.partialOne + e.partialTwo;

      noteStudent = (noteStudent / 3) * .7f;

      notes.add(noteStudent);
    }

    return notes;
  }
}
