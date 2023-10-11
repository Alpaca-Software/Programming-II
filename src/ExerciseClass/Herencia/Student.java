package javaapplication;

public class Student extends Person {

  private String codeStudent;
  private int semester;

  public Student(
      String document,
      String name1,
      String name2,
      String lastName1,
      String lastName2,
      String codeStudent,
      int semester,
      int age) {
    super(document, name1, name2, lastName1, lastName2, age);
    this.setCodeStudent(codeStudent);
    this.setSemester(semester);
  }

  public String getCodeStudent() {
    return codeStudent;
  }

  public void setCodeStudent(String codeStudent) {
    this.codeStudent = codeStudent;
  }

  public int getSemester() {
    return semester;
  }

  public void setSemester(int semester) {
    this.semester = semester;
  }
}
