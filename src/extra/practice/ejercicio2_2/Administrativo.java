package tendencias.Ejercicio2_2;

public class Administrativo extends Persona {

  private int numeroAños;

  public Administrativo(
      int numeroAños,
      String nombre,
      String apellido,
      String telefono,
      int edad,
      String direccion,
      String sexo) {

    super(nombre, apellido, telefono, edad, direccion, sexo);
    this.numeroAños = numeroAños;
  }

  public int getNumeroAños() {
    return numeroAños;
  }

  public void setNumeroAños(int numeroAños) {
    this.numeroAños = numeroAños;
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
    return "Administrativo{" + "numeroA\u00f1os=" + numeroAños + '}' + super.toString();
  }
}
