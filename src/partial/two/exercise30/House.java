package coco77.exercise30;

import java.util.ArrayList;
import java.util.List;

public class House {
  String partyHouse;

  public House(String partyHouse) {
    this.partyHouse = partyHouse;
  }

  public String getPartyHouse() {
    return partyHouse;
  }

  public void setPartyHouse(String partyHouse) {
    this.partyHouse = partyHouse;
  }

  public static List concatPartysHouse(ArrayList<House> house) {

    List<House> house1 = new ArrayList<>(house);

    return house1;
  }
}
