package Partial.One.Exercise13;

public class Month {

  private String mosth;

  public static final String[] MONTHS = {
    "january",
    "February",
    "March",
    "April",
    "May",
    "June",
    "July",
    "Agust",
    "september",
    "octuber",
    "november",
    "december"
  };

  public Month(String mosth) {
    this.mosth = mosth;
  }

  public String getMosth() {
    return mosth;
  }

  public void setMosth(String mosth) {
    this.mosth = mosth;
  }

  public void calculateEndOfYear() {
    int size = MONTHS.length;

    for (int i = 0; i < size; i++) {
      if (MONTHS[i].equalsIgnoreCase(mosth)) {
        size = i;
      }
    }
    int missingMonths = (MONTHS.length) - (size - 1);
    System.out.println("the months left until the end of the year is: " + missingMonths);
  }
}
