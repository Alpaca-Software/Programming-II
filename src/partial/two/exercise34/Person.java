package partial.two.exercise34;

class Person {
  private String name;
  private String document;
  private int age;

  public Person(String name, String document, int age) {
    this.setName(name);
    this.setDocument(document);
    this.setAge(age);
  }

  public static int countAgeOver(Person[] persons, int age) {
    int total = 0;

    for (Person person : persons) {
      if (person.getAge() > age) {
        total++;
      }
    }

    return total;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDocument() {
    return document;
  }

  public void setDocument(String document) {
    this.document = document;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}
