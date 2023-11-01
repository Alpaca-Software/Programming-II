package partial.two.exercise1;

public class Employe {

  private String nameEmploye;
  private float dayWorker;
  public static final float PRICE_day = 4000;

  public Employe(String nameEmploye, int dayWorker) {
    this.setNameEmploye(nameEmploye);
    this.setDayWorker(dayWorker);
  }

  public String getNameEmploye() {
    return nameEmploye;
  }

  public void setNameEmploye(String nameEmploye) {
    this.nameEmploye = nameEmploye;
  }

  public float getDayWorker() {
    return dayWorker;
  }

  public void setDayWorker(float dayWorker) {
    this.dayWorker = dayWorker;
  }

  public static Employe[] calculateSalaryEmploye(Employe[] employes, int size) {
    Employe[] employess = new Employe[size];

    for (int i = 0; i < size; i++) {
      employess[i] = employes[i];
    }

    for (Employe e : employess) {
      e.setDayWorker(e.dayWorker * PRICE_day);
    }

    return employess;
  }
}
