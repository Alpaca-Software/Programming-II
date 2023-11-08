package partial.two.exercise19;

/*77*/
public class Season {

    private String seasonOfYear;
    public static final String SPRING[] = {"March", "April", "May", "June"};
    public static final String SUMMER[] = {"June", "July", "August", "september"};
    public static final String FALL[] = {"September", "October", "November", "December"};
    public static final String WINTER[] = {"December", "January", "February", "March"};
    public static final String SEASON[] = {"spring", "summer", "fall", "winter"};

    public Season(String seasonOfYear) {
        this.setSeasonOfYear(seasonOfYear);
    }

    public String getSeasonOfYear() {
        return seasonOfYear;
    }

    public void setSeasonOfYear(String seasonOfYear) {
        this.seasonOfYear = seasonOfYear;
    }

    public void showSeasonOfYears() {
        if (this.seasonOfYear.equalsIgnoreCase(Season.SEASON[0])) {
            for (String s : SPRING) {
                System.out.println("Los meses correspondientes son los siguientes = " + s);
            }
        } else if (this.seasonOfYear.equalsIgnoreCase(SEASON[1])) {
            for (String s : SUMMER) {
                System.out.println("Los meses correspondientes son los siguientes = " + s);

            }
        } else if (this.seasonOfYear.equalsIgnoreCase(SEASON[2])) {
            for (String s : FALL) {
                System.out.println("Los meses correspondientes son los siguientes = " + s);

            }
        } else if (this.seasonOfYear.equalsIgnoreCase(SEASON[3])) {
            for (String s : WINTER) {
                System.out.println("Los meses correspondientes son los siguientes = " + s);

            }
        }else{
            System.out.println("Discupe!! ingrese de nuevo la estación para corroborrar correctamente la estación del año");
        }
    }

}
