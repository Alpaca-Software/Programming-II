package Partial.One.Exercise5;

public class Student {

  private String document;
  private String name;
  private float age;

  public static float average;

  public Student(String document, String name, float age) {
    this.document = document;
    this.name = name;
    this.age = age;
  }

  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public float getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public static void calculateAverageAge(Student student[], int sizeStudent) {
    for (Student e : student) {
      Student.average += e.getAge();
    }
    average /= sizeStudent;
  }
}
