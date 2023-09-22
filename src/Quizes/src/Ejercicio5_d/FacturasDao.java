
package Ejercicio5_d;



public class FacturasDao {
    
    private String nombreProducto;
    private double precioproducto;

    public FacturasDao(String nombreProducto, double precioproducto) {
        this.nombreProducto = nombreProducto;
        this.precioproducto = precioproducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioproducto() {
        return precioproducto;
    }

    public void setPrecioproducto(double precioproducto) {
        this.precioproducto = precioproducto;
    }
    
    
   
}
