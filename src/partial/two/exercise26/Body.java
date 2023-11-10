package partial.two.exercise26;

import java.util.ArrayList;

/**
 * @author pinto
 */
public class Body {
  private String partyBody;

  public Body(String partyBody) {
    this.setPartyBody(partyBody);
  }

  public String getPartyBody() {
    return partyBody;
  }

  public void setPartyBody(String partyBody) {
    this.partyBody = partyBody;
  }

  public static void showListPartysBody(ArrayList<Body> body) {
    int size = body.size();

    for (int i = size - 1; i >= 0; i--) {
      System.out.println(body.get(i).partyBody);
    }
  }
}
