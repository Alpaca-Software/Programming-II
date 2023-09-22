package Ejercicio2_2;

public class Profesores extends Persona {

  private String ultimoPosgrado;
  private Mostrar m;

  public Profesores(
      String ultimoPosgrado,
      String nombre,
      String apellido,
      String telefono,
      int edad,
      String direccion,
      String sexo) {

    super(nombre, apellido, telefono, edad, direccion, sexo);
    this.ultimoPosgrado = ultimoPosgrado;
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

  public String getApellido() {
    return apellido;
  }

  public String getTelefono() {
    return telefono;
  }

  public int getEdad() {
    return edad;
  }

  public String getDireccion() {
    return direccion;
  }

  public String getSexo() {
    return sexo;
  }

  @Override
  public String toString() {
    return "Profesores{" + "ultimoPosgrado=" + ultimoPosgrado + '}' + super.toString();
  }
}
