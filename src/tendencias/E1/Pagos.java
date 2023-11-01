package tendencias.E1;

import java.util.ArrayList;
import java.util.Scanner;

public class Pagos {

  private final int cantidadClientes = 3;
  Cliente client;
  Objetos o;

  ArrayList<Cliente> clientes = new ArrayList<>();
  ArrayList<Objetos> objetos = new ArrayList<>();

  public void pedirDatos() {

    Scanner m = new Scanner(System.in);

    for (int i = 0; i < cantidadClientes; i++) {

      System.out.println("Por favor digite el nombre del cliente " + (i + 1));
      String nombreCliente = m.next();
      System.out.println("Por favor digite la cedula del cliente " + (i + 1));
      String cedulaCliente = m.next();

      clientes.add(new Cliente(nombreCliente, cedulaCliente));

      System.out.println("por favor digite el nombre del  " + (i + 1) + "° objeto vendido");
      String nombreProducto = m.next();
      System.out.println("por favor digite el precio del objeto vendido");
      double precioProducto = m.nextDouble();

      objetos.add(new Objetos(nombreProducto, precioProducto));
    }
  }

  public void hacerPagos() {

    int sumador = 0;

    for (Objetos objeto : objetos) {

      sumador += objeto.getPrecioProducto();
    }

    System.out.println("El toral es de: " + sumador);
  }

  public void listaVentas() {
    for (int i = 0; i < clientes.size(); i++) {

      System.out.println(
          clientes.get(i).getNombreCliente() + " " + clientes.get(i).getCedulaCliente());
      System.out.println("Compro el siguiente articulo");
      System.out.println(
          objetos.get(i).getNombreProducto() + " " + objetos.get(i).getPrecioProducto());
    }
  }
}
