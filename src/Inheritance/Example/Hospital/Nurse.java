package Inheritance.Example.Hospital;

public class Nurse extends Person {

  private String code;
  private String block;

  public Nurse(
      String document,
      String name1,
      String name2,
      String surname1,
      String surname2,
      String birthDay,
      String code,
      String block) {
    super(document, name1, name2, surname1, surname2, birthDay);

    this.setCode(code);
    this.setBlock(block);
  }

  public String getBlock() {
    return block;
  }

  public void setBlock(String block) {
    this.block = block;
  }

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }
}
