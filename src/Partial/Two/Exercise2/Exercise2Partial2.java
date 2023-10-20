package coco77.exercise2partial2;

/*"2. Del ejercicio anterior se deberá enviar la lista a un nuevo método y añadir una bonificación al salario si el trabajador gana menos de un MÍNIMO.
Mostrar la nueva lista por consola."*/
public class Exercise2Partial2 {

  public static void main(String[] args) {

    Employee employes[] = new Employee[5];

    employes[0] = new Employee("felipe", 18);
    employes[1] = new Employee("Luis", 1);
    employes[2] = new Employee("Eduardo", 0);
    employes[3] = new Employee("Coco77", 22);
    employes[4] = new Employee("Andrey", 72);

    Employee.calculateSalaryToPay(employes);
  }
}
