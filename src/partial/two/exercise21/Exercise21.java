package partial.two.exercise21;

/*
"21. Enseñe las vocales al sistema, guárdelas en un arreglo de la siguiente manera,
en la primera posición del arreglo almacene un arreglo con las vocales en minúsculas
y en la segunda posición del array almacena un array con las vocales en mayúsculas,
luego solicita una letra por teclado y comprueba si es una vocal."

"21. Teach the vowels to the system, store them in an array as follows, in the first
position of the array store an array with the vowels in lowercase and in the second position
of the array store an array with the vowels in uppercase, then request a letter by
keyboard and check if it is a vowel."
 */
import java.util.*;

public class Exercise21 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String vowel = sc.next();

    Vowel vowel1 = new Vowel(vowel);

    vowel1.showIfIsVowel();
  }
}
