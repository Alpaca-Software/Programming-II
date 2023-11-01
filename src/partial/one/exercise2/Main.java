package partial.one.exercise2;

/**
 * "2. A doctor needs the IMC of patients. Create a list with the document, weight and height, now
 * you need to average the IMC calculated during the day."
 */
public class Main {

  public static void main(String[] args) {

    String patientName = "Felipe Pinto";
    String document = "1049019557";
    float weight = 70;
    float height = (float) 1.77;

    Patient patient = new Patient(patientName, document, weight, height);

    patient.calculateImc();
  }
}
