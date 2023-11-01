package extra.practice.ejercicio2_4;

public class Urgente extends Correo {

  public Urgente(String destinatario, String mensaje) {
    super(destinatario, mensaje);
  }

  @Override
  public String toString() {
    return "Urgente{" + '}' + super.toString();
  }
}
