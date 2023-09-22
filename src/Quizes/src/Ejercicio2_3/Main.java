/*
 3. Una empresa necesita un programa para calcular el salario a pagar por dos 
tipos de empleados, cajeros y vendedores ambulantes, si el total vendido por
cada trabajador sea mayor al millón de pesos, sumarle un bono del 10% de 
lo vendido al salario base.
El salario base es un mínimo en Colombia"
 */

package Ejercicio2_3;

public class Main {
    public static void main(String[] args) {
        
        Vendedor v = new Vendedor ("Maicol", 1100000);
        Cajero c = new Cajero("Maria", 150000);
        
        mostrar(v);
        mostrar(c);
        
    }
    
    public static void mostrar(Empleado e){
        
        e.calcularSalario();
    }
}
