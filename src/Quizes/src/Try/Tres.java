package Try;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Tres {
  public static void main(String[] args) {

    try {

      String ruta = "/ruta/filename.txt";
      String contenido = "Contenido de ejemplo";
      File file = new File(ruta);
      // Si el archivo no existe es creado
      if (!file.exists()) {
        file.createNewFile();
      }
      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(contenido);
      bw.close();
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
