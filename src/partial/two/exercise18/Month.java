package partial.two.exercise18;

public class Month {

  private String mosth;

  public static final String MONTHS[] = {
    "January",
    "February",
    "March",
    "April",
    "May",
    "June",
    "July",
    "Agust",
    "September",
    "Octuber",
    "November",
    "December"
  };

  public Month(String mosth) {
    this.setMosth(mosth);
  }

  public String getMosth() {
    return mosth;
  }

  public void setMosth(String mosth) {
    this.mosth = mosth;
  }

  public void calculateEndOfYear() {
    int size = MONTHS.length;
    int monthIndex = -1;

    for (int i = 0; i < size; i++) {
      if (MONTHS[i].equalsIgnoreCase(mosth)) {
        monthIndex = i;
        break;
      }
    }

    String outputMessage =
        (monthIndex != -1)
            ? "missingMonths = " + ((MONTHS.length) - (monthIndex + 1))
            : "el mes especificado no se encontro";

    System.out.println(outputMessage);
  }
}
