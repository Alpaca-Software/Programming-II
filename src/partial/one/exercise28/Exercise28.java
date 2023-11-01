package partial.one.exercise28;

/**
 * 28. Store a list of ages in an array, now you want to know how many of them are minors and how
 * many are adults.
 */
public class Exercise28 {

  public static void main(String[] args) {

    Age ages[] = new Age[5];

    ages[0] = new Age(17);
    ages[1] = new Age(11);
    ages[2] = new Age(77);
    ages[3] = new Age(14);
    ages[4] = new Age(18);

    Age.calculateLegal(ages);
    Age.calculateMinior(ages);

    Age.Ageclassification(Age.calculateLegal(ages), Age.calculateMinior(ages));
  }
}
