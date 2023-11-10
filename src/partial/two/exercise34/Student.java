package partial.two.exercise34;

class Student extends Person {
  private String code;

  public Student(String name, String document, int age, String code) {
    super(name, document, age);

    this.setCode(code);
  }

  @Override
  public String toString() {
    return String.format(
        "<Student %s (%s)[%s] %d years>",
        this.getName(), this.getDocument(), this.getCode(), this.getAge());
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
}
