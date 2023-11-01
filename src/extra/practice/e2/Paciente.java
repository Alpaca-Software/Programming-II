package tendencias.E2;

public class Paciente {

  private double pesoPaciente;
  private double alturaPaciente;

  public Paciente(double pesoPaciente, double alturaPaciente) {
    this.pesoPaciente = pesoPaciente;
    this.alturaPaciente = alturaPaciente;
  }

  public double getPesoPaciente() {
    return pesoPaciente;
  }

  public void setPesoPaciente(double pesoPaciente) {
    this.pesoPaciente = pesoPaciente;
  }

  public double getAlturaPaciente() {
    return alturaPaciente;
  }

  public void setAlturaPaciente(double alturaPaciente) {
    this.alturaPaciente = alturaPaciente;
  }

  @Override
  public String toString() {
    return "Paciente{"
        + "pesoPaciente="
        + pesoPaciente
        + ", alturaPaciente="
        + alturaPaciente
        + '}';
  }
}
