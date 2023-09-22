/*
“4. Un trabajador recibe su salario mensual en moneda colombiana,
si percibe más de un salario mínimo,
añadir un bono de transporte"
*/
package ejercicio4;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner m = new Scanner (System.in);
        int salario;
        
        System.out.println("Digite el salrio del empleado");
        salario=m.nextInt();
        
        Empleado e = new Empleado(salario);
        System.out.println("El salario del empleado es de: "+"$ "+e.calcularSalario());
    }
}
