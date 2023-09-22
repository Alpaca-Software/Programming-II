/*
Desarrollar un programa que solicite los datos personales de los clientes
de una compra venta, además de solicitar datos del
objetos empeñados. Debes crear una lista con tres clientes y los productos vendidos.
Y al final saber el total pagado en el día."
*/
package E1;

public class Main {
  public static void main(String[] args) {

    Pagos p = new Pagos();
    p.pedirDatos();
    p.hacerPagos();
    p.listaVentas();
  }
}
