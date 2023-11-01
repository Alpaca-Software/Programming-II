package extra.practice.e3;

import java.util.Scanner;

public class Estudiante extends Persona implements IPedirDatos {
  private String carrera;

  public Estudiante(String carrera, String nombre, String cedula, String edad, String sexo) {
    super(nombre, cedula, edad, sexo);
    this.carrera = carrera;
  }

  @Override
  public void pedirDatos() {
    Scanner m = new Scanner(System.in);

    System.out.println("Digite el nombre del estudiante");
    this.nombre = m.next();
    System.out.println("Digite la cedula del estudiante");
    this.cedula = m.next();
    System.out.println("Digite la edad del estudiante");
    this.edad = m.next();
    System.out.println("Digite el sexo del estudiante");
    this.sexo = m.next();
    System.out.println("Digite la carrera  del estudiante");
    this.carrera = m.next();
  }

  @Override
  public void mostrarDatos() {

    System.out.println(
        this.nombre
            + " con CC: "
            + this.cedula
            + " sexo: "
            + this.sexo
            + " cursa la carrera de: "
            + this.carrera
            + " con la edad de: "
            + this.edad);
  }

  public String getCarrera() {
    return carrera;
  }

  public void setCarrera(String carrera) {
    this.carrera = carrera;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getCedula() {
    return cedula;
  }

  public void setCedula(String cedula) {
    this.cedula = cedula;
  }

  public String getEdad() {
    return edad;
  }

  public void setEdad(String edad) {
    this.edad = edad;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }
}
