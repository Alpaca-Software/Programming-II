package language.inheritance.example.hospital;

public class Main {

  public static void main(String[] args) {
    String document = "1091236547";
    String name1 = "Pedro";
    String name2 = "Pablo";
    String surname1 = "Perez";
    String surname2 = "";
    String birthDay = "2002-01-06";
    String code = "02599";
    String block = "5";

    Nurse nurse1 = new Nurse(document, name1, name2, surname1, surname2, birthDay, code, block);

    Doctor doctor1 = new Doctor("Vago", document, name1, name2, surname1, surname2, birthDay, code);
  }
}
