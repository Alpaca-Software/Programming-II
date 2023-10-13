package Inheritance.Example.Hospital;

public class Doctor extends Person {

    private String speciality;
    private String code;

    public Doctor(String speciality, String document, String name1, String name2, String surname1, String surname2, String birthDay, String code) {
        super(document, name1, name2, surname1, surname2, birthDay);

        this.setSpeciality(speciality);
        this.setCode(code);
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}
