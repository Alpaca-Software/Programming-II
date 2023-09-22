package PartialOne.ExerciseFour;

/**
 * "4. You have a list of students with the following data: name, score of the first partial, score
 * of the second partial, total score of the quizes and the score of the final exam. It is necessary
 * to know if the student passes the subject."
 */
public class Main {

  public static void main(String[] args) {
    String name = "Felipe Pinto";
    float scoreFirstPartial = (float) 3.0;
    float scoreSecondPartial = (float) 3.0;
    float quiz = (float) 3.0;
    float finalExamen = (float) 3.0;

    Student student = new Student(name, scoreFirstPartial, scoreSecondPartial, quiz, finalExamen);

    student.CalculateDefinive();
  }
}
