package ejercicio5;

public class Vocales {

  private String palabra;

  public Vocales(String palabra) {
    this.palabra = palabra;
  }

  public void evaluarVocales() {

    switch (this.palabra) {
      case "a":
        System.out.println("Es una vocal");
        break;
      case "e":
        System.out.println("Es una vocal");
        break;
      case "i":
        System.out.println("Es una vocal");
        break;
      case "o":
        System.out.println("Es una vocal");
        break;
      case "u":
        System.out.println("Es una vocal");
        break;
      default:
        System.out.println("No es una vocal");
        break;
    }
  }
}
