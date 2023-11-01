package tendencias.Ejercicio2_2;

public class Persona {

  protected String nombre;
  protected String apellido;
  protected String telefono;
  protected int edad;
  protected String direccion;
  protected String sexo;

  public Persona(
      String nombre, String apellido, String telefono, int edad, String direccion, String sexo) {

    this.nombre = nombre;
    this.apellido = apellido;
    this.telefono = telefono;
    this.edad = edad;
    this.direccion = direccion;
    this.sexo = sexo;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getTelefono() {
    return telefono;
  }

  public void setTelefono(String telefono) {
    this.telefono = telefono;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public String getDireccion() {
    return direccion;
  }

  public void setDireccion(String direccion) {
    this.direccion = direccion;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  @Override
  public String toString() {
    return "Persona{"
        + "nombre="
        + nombre
        + ", apellido="
        + apellido
        + ", telefono="
        + telefono
        + ", edad="
        + edad
        + ", direccion="
        + direccion
        + ", sexo="
        + sexo
        + '}';
  }
}
