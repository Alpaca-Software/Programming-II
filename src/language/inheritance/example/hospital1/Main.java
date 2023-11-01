package language.inheritance.example.hospital1;

public class Main {
  public static void main(String[] args) {
    String document = "1043319557";
    String name1 = "felipe";
    String name2 = "";
    String surname1 = "pinto";
    String surname2 = "";
    String birthDay = "2005-02-18";
    String code = "192177";
    String block = "5";

    Nurse nurse1 = new Nurse(code, block, document, name1, name2, surname1, surname2, birthDay);
    Doctor doctor1 =
        new Doctor(
            "pediatra", "209876", "289120334", "andrey", "felipe", "pinto", "uribe", "2005-02-18");

    System.out.println(doctor1.getBirthDay());

    System.out.println(nurse1.getAge());

    System.out.println(doctor1.getAge());

    System.out.println(doctor1.toString());
  }
}
