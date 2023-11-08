
package exercise24;



public class Exercise24 {

    
    public static void main(String[] args) {
        
       Donation listaDonaciones = new Donation();

        // Agrega donaciones a la lista
        listaDonaciones.add(50.0);
        listaDonaciones.add(100.0);
        listaDonaciones.add(200.0);

        // Cuenta las donaciones
        int cantidadDonaciones = listaDonaciones.contarDonaciones();
        System.out.println("Cantidad de donaciones: " + cantidadDonaciones);

        // Suma las donaciones
        double sumaDonaciones = listaDonaciones.sumarDonaciones();
        System.out.println("Suma de donaciones en dólares: " + sumaDonaciones);
        
       
    }
    
    
}
