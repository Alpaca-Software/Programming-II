package PartialOne.ExerciseTwo;

// ❤77❤️//️
public class Patient {

  String patientName;
  String document;
  float weight;
  float height;

  public Patient(String patientName, String document, float weight, float height) {
    this.patientName = patientName;
    this.document = document;
    this.weight = weight;
    this.height = height;
  }

  public void calculateImc() {
    // formule IMC = peso(kg)/[estatura(m)¨2]
    float imc;
    imc = (float) (this.weight / Math.pow(this.height, 2));

    System.out.println("the IMC the patient " + this.patientName + " is the: " + imc);
  }
}
