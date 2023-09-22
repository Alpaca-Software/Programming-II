
package Ejercicio2_1;

public class Cliente {
    
    private String nombre ;
    private String apellido;
    private String telefono;
    private int edad;
    Objeto o;

    public Cliente(String nombre, String apellido, String telefono, int edad, Objeto o) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.edad = edad;
        this.o = o;
    }

    public void mostrarInformacion(){
        
        System.out.println("El cliente "+this.nombre+" "+this.apellido+" compro el producto "+o.nombreObjeto+" al precio de "+o.precioNegociado);
        
        
        
    }
    
    
}
