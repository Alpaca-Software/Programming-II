package exerciseClass.herencia;

public class Professor extends Person {

  private String codeProfessor;
  private String[] listSudjects;

  public Professor(
      String codeProfessor,
      String[] listSudjects,
      String document,
      String name1,
      String name2,
      String lastName1,
      String lastName2,
      int age) {
    super(document, name1, name2, lastName1, lastName2, age);
    this.codeProfessor = codeProfessor;
    this.listSudjects = listSudjects;
  }

  public String getCodeProfessor() {
    return codeProfessor;
  }

  public void setCodeProfessor(String codeProfessor) {
    this.codeProfessor = codeProfessor;
  }

  public String[] getListSudjects() {
    return listSudjects;
  }

  public void setListSudjects(String[] listSudjects) {
    this.listSudjects = listSudjects;
  }
}
