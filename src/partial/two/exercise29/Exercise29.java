package coco77.exercise29;

import java.util.ArrayList;
import java.util.List;

/*"29. Create two list, the first with a list of five animals(name and type) and the second with foods.
Now you need to loop through them and concatenate the first animal with the first food."

"29. Crea dos listas, la primera con una lista de cinco animales (nombre y tipo) y la segunda con alimentos.
Ahora necesitas recorrerlos y concatenar el primer animal con la primera comida".*/

public class Exercise29 {

  public static void main(String[] args) {

    List<Animal> animalList = new ArrayList<>();
    List<Food> foodList = new ArrayList<>();

    // Agregar animales a la lista de animales
    animalList.add(new Animal("León", "Carnívoro"));
    animalList.add(new Animal("Elefante", "Herbívoro"));
    animalList.add(new Animal("Tigre", "Carnívoro"));
    animalList.add(new Animal("Jirafa", "Herbívoro"));
    animalList.add(new Animal("Oso", "Omnívoro"));

    // Agregar alimentos a la lista de alimentos
    foodList.add(new Food("Carne"));
    foodList.add(new Food("Hierba"));
    foodList.add(new Food("Pescado"));
    foodList.add(new Food("Hojas"));
    foodList.add(new Food("Bayas"));

    if (!animalList.isEmpty() && !foodList.isEmpty()) {
      // Obtener el primer animal y el primer alimento
      int size = animalList.size();

      for (int i = 0; i < size; i++) {
        String result =
            "el animal "
                + animalList.get(i).getName()
                + " se alimenta de "
                + foodList.get(i).getName();
        System.out.println(result);
      }
    } else {
      System.out.println("Al menos una de las listas está vacía.");
    }
  }
}
