package tendencias.Ejercicio5_d;

import java.util.ArrayList;

public class FacturasDto {

  FacturasDao f;
  public ArrayList<FacturasDao> fac = new ArrayList<>();

  public void llenarFacturas() {

    fac.add(new FacturasDao("Perro", 50));
    fac.add(new FacturasDao("auyama", 3000));
    fac.add(new FacturasDao("Air Jordan 4", 1000000));
    fac.add(new FacturasDao("pc", 192354));
    fac.add(new FacturasDao("carro", 150000));
    fac.add(new FacturasDao("", 0));
    fac.add(new FacturasDao("garzon gay", 0));
    fac.add(new FacturasDao("garzon gay", 0));
    fac.add(new FacturasDao("garzon gay", 0));
    fac.add(new FacturasDao("garzon gay", 0));
  }
}
