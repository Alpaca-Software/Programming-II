package E3;

import java.util.Scanner;

public class Docente extends Persona implements IPedirDatos {
  private String ultimoPosgrado;

  public Docente(String ultimoPosgrado, String nombre, String cedula, String edad, String sexo) {
    super(nombre, cedula, edad, sexo);
    this.ultimoPosgrado = ultimoPosgrado;
  }

  @Override
  public void pedirDatos() {
    Scanner m = new Scanner(System.in);

    System.out.println("Digite el nombre del docente");
    this.nombre = m.next();
    System.out.println("Digite la cedula del docente");
    this.cedula = m.next();
    System.out.println("Digite la edad del docente");
    this.edad = m.next();
    System.out.println("Digite el sexo del docente");
    this.sexo = m.next();
    System.out.println("Digite el ultimo posgrado  del docente");
    this.ultimoPosgrado = m.next();
  }

  @Override
  public void mostrarDatos() {

    System.out.println(
        this.nombre
            + " con CC: "
            + this.cedula
            + " sexo: "
            + this.sexo
            + " curso el posgrado de: "
            + this.ultimoPosgrado
            + " con la edad de: "
            + this.edad);
  }

  public String getUltimoPosgrado() {
    return ultimoPosgrado;
  }

  public void setUltimoPosgrado(String ultimoPosgrado) {
    this.ultimoPosgrado = ultimoPosgrado;
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
