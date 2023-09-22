
package Ejercicio2_4;

public class Correo {
    
    public String destinatario;
    public String mensaje;
    

    public Correo(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Correo{" + "destinatario=" + destinatario + ", mensaje=" + mensaje + '}';
    }
    
    
    
}
