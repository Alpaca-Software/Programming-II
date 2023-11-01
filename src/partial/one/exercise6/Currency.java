package partial.one.exercise6;

public class Currency {

  private String currency;
  private double value;
  public static final double VALUE_EURO = 4200;
  public static final double VALUE_DOLLAR = 3900;

  public Currency() {}

  public Currency(String currency, double value) {
    this.currency = currency.toLowerCase();
    this.value = value;
  }

  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public double getValue() {
    return this.value;
  }

  public void setValue(double value) {
    this.value = value;
  }

  public static void calculateCurrencyConversion(Currency[] currencies) {
    for (Currency c : currencies) {
      if (c.getCurrency().equals("dollar")) {
        System.out.println(
            "For the  "
                + c.getCurrency()
                + " user the monetary value is $: "
                + c.getValue() * Currency.VALUE_DOLLAR);
      } else if (c.getCurrency().equals("euro")) {
        System.out.println(
            "For the  "
                + c.getCurrency()
                + " user the  monetary value es $ : "
                + c.getValue() * Currency.VALUE_EURO);
      } else {
        System.out.println("unrecognized currency ");
      }
    }
  }
}
