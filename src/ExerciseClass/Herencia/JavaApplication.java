package javaapplication;

public class JavaApplication {

  public static void main(String[] args) {

    Student student1 =
        new Student("104901944", "Coco77", "felipe", "Ponto", "Uribe", "192177", 3, 17);

    Student student2 =
        new Student("104901924", "lione7", "felipe", "Ponto", "Uribe", "192155", 3, 18);

    Student student3 =
        new Student("104900944", "andrey", "felipe", "Ponto", "Uribe", "192077", 3, 18);

    Professor professor1 =
        new Professor(
            "052599",
            new String[] {"programming"},
            "1049012893",
            "Luis",
            "Eduardo",
            "Docente",
            "Hernandez",
            27);

    student1.calculateLegalAge();
    professor1.calculateLegalAge();

    Person persons[] = {student1, student2, student3, professor1};
  }
}
