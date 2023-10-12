/*
"Desarrollar un programa que solicite los datos personales de los clientes
de una compra venta, además de solicitar datos del
objetos a negociar, como una descripción y el valor negociado, que representa
entre el 10% y el 20% del valor real del producto”.
 */
package Ejercicio2_1;

public class Main {

  public static void main(String[] args) {

    Objeto o = new Objeto(250000, "se puede conducir", "Carro");
    Cliente c = new Cliente("Maicol", "Robles", "3104281078", 19, o);
    c.mostrarInformacion();
  }
}
