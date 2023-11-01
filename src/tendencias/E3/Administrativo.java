package tendencias.E3;

import java.util.Scanner;

public class Administrativo extends Persona implements IPedirDatos {

  private String numeroDeAñosTrabajados;

  public Administrativo(
      String numeroDeAñosTrabajados, String nombre, String cedula, String edad, String sexo) {
    super(nombre, cedula, edad, sexo);
    this.numeroDeAñosTrabajados = numeroDeAñosTrabajados;
  }

  @Override
  public void pedirDatos() {
    Scanner m = new Scanner(System.in);

    System.out.println("Digite el nombre del administrativo");
    this.nombre = m.next();
    System.out.println("Digite la cedula del administrativo");
    this.cedula = m.next();
    System.out.println("Digite la edad del administrativo");
    this.edad = m.next();
    System.out.println("Digite el sexo del administrativo");
    this.sexo = m.next();
    System.out.println("Digite los años de experiencia del administrativo");
    this.numeroDeAñosTrabajados = m.next();
  }

  @Override
  public void mostrarDatos() {

    System.out.println(
        this.nombre
            + " con CC: "
            + this.cedula
            + " sexo: "
            + this.sexo
            + " tiene los sigiuentes años de experiencia: "
            + this.numeroDeAñosTrabajados
            + " y cuenta con la edad de: "
            + this.edad);
  }

  public String getNumeroDeAñosTrabajados() {
    return numeroDeAñosTrabajados;
  }

  public void setNumeroDeAñosTrabajados(String numeroDeAñosTrabajados) {
    this.numeroDeAñosTrabajados = numeroDeAñosTrabajados;
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
