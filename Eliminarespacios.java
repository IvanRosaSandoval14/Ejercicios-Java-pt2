import java.util.Scanner;

public class Eliminarespacios {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
     System.out.println("Escribe frases para eliminar espacios. Escribe 'salir' para terminar.");
     String cadena = scanner.nextLine();

     String Sinespacios = cadena.replaceAll("\\s+", "");

      System.out.println("Cadena sin espacios: " + Sinespacios);
     
      scanner.close();
      
  }  

}
