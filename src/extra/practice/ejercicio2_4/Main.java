/*
4. Se necesita un sistema de entrega de correo electrónico, hay diferentes
tipos de correos electrónicos, los hay certificados y urgentes,
los atributos que comparten es el destinatario,
que es un correo electrónico, y el contenido del mensaje,
os correos electrónicos certificados tienen un atributo con el código de certificación
que se envía al crear los objetos,
finalmente es necesario almacenar varios objetos de cada
clase en un array y recorrerlo con un foreach."
*/
package extra.practice.ejercicio2_4;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {

    Mostrar m = new Mostrar();

    ArrayList<Correo> correos = new ArrayList<>();
    correos.add(new Certificado("12", "Maicol", "hola"));
    correos.add(new Urgente("marcela", "chao"));

    m.mostrarCorreos(correos);
  }
}
