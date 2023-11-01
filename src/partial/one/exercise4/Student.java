package partial.one.exercise4;

/** */
public class Student {

  String name;
  float scoreFirstPartial;
  float scoreSecondPartial;
  float quiz;
  float finalExamen;

  public Student(
      String name,
      float scoreFirstPartial,
      float scoreSecondPartial,
      float quiz,
      float finalExamen) {
    this.name = name;
    this.scoreFirstPartial = scoreFirstPartial;
    this.scoreSecondPartial = scoreSecondPartial;
    this.quiz = quiz;
    this.finalExamen = finalExamen;
  }

  public float CalculateSeventyNote() {
    float seventyNote = 0;

    seventyNote = (this.scoreFirstPartial + this.scoreSecondPartial + this.quiz) / 3;

    seventyNote = (seventyNote * 70) / 100;

    return seventyNote;
  }

  public float CalculateThirtyNote() {
    float thirtyNote = 0;

    thirtyNote = (this.finalExamen * 30) / 100;

    return thirtyNote;
  }

  public void CalculateDefinive() {
    float finalNote = 0;
    finalNote = CalculateSeventyNote() + CalculateThirtyNote();

    if (finalNote >= 3.0) {
      System.out.println("The student passe the subject" + " note: " + finalNote);
    } else {
      System.out.println("The student no passe the subject");
    }
  }
}
