/*
 “2. Desarrollar un programa que solicite datos significativos de las personas
que trabajan o estudian en la universidad, existen tres tipos
de usuarios: estudiantes, profesores y administradores. Además, necesitas
la carrera de los alumnos, de los profesores necesitas
el último posgrado realizado y de los administrativos
el número de años trabajados.”
 */
package Ejercicio2_2;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    Mostrar m = new Mostrar();

    ArrayList<Profesores> p = new ArrayList<>();
    p.add(
        new Profesores(
            "Magister", "Maicol", "Robles salazar", "3104281078", 30, "Juan 23", "El Macho"));
    p.add(
        new Profesores(
            "Magister", "Maicol", "Robles salazar", "3104281078", 30, "Juan 23", "El Mocho"));
    p.add(
        new Profesores(
            "Magister", "Maicol", "Robles salazar", "3104281078", 30, "Juan 23", "El Malo"));
    m.mostrarDatos(p);

    System.out.println(
        "----------------------------------------------------------------------------------");

    ArrayList<Administrativo> a = new ArrayList<>();
    a.add(new Administrativo(10, "marcelo", "contreras", "3142987642", 50, "marabel", "Masculino"));
    a.add(new Administrativo(10, "marcela", "contreras", "3142987642", 50, "marabel", "Femenino"));
    a.add(new Administrativo(10, "marcos", "contreras", "3142987642", 50, "marabel", "Masculino"));
    m.mostrarDatos(a);

    System.out.println(
        "------------------------------------------------------------------------------------");

    ArrayList<Estudiante> e = new ArrayList<>();
    e.add(
        new Estudiante(
            "Sistemas", "marcelo", "contreras", "3142987642", 50, "marabel", "Masculino"));
    e.add(
        new Estudiante(
            "comunicacion", "marcela", "contreras", "3142987642", 20, "marabel", "Femenino"));
    e.add(
        new Estudiante(
            "zootecnia", "marcos", "contreras", "3142987642", 10, "marabel", "Masculino"));
    m.mostrarDatos(e);
  }
}
