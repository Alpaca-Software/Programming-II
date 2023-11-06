

package coco77.exercise19;

/*"19. Solicita la estación del año mediante teclado, la consola muestra los meses que la representan.
      Los meses de primavera son: marzo, abril, mayo y junio.
      Los meses de verano son: junio, julio, agosto y septiembre.
      Los meses de otoño son: septiembre, octubre, noviembre y diciembre.
      Los meses de invierno son: diciembre, enero, febrero y marzo."


"19. Request the season of the year by keyboard, the console shows the months that represent it.
      The spring months are: March, April, May and June.
      The summer months are: June, July, August and September.
      The fall months are: September, October, November and December.
      The winter months are: December, January, February and March."
 */
import java.util.*;

public class Exercise19 {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     String seasonOfYear = sc.nextLine();
     
     

     Season season = new Season(seasonOfYear);
     
     season.showSeasonOfYears();
    }
}
