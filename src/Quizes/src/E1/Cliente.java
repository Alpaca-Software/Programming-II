
package E1;

public class Cliente {
    
    private String nombreCliente;
    private String cedulaCliente;

    public Cliente(String nombreCliente, String cedulaCliente) {
        this.nombreCliente = nombreCliente;
        this.cedulaCliente = cedulaCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCliente=" + nombreCliente + ", cedulaCliente=" + cedulaCliente + '}';
    }
    
    
    
    
}
