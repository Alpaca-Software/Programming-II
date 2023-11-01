package tendencias.Ejercicio2_4;

public class Certificado extends Correo {

  private String codigoDeCertificacion;

  public Certificado(String codigoDeCertificacion, String destinatario, String mensaje) {

    super(destinatario, mensaje);
    this.codigoDeCertificacion = codigoDeCertificacion;
  }

  @Override
  public String toString() {
    return "Certificado{"
        + "codigoDeCertificacion="
        + codigoDeCertificacion
        + '}'
        + super.toString();
  }
}
