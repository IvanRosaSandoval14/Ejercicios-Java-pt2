import java.util.Scanner;

public class Eliminarultimapalabra {

    public static void main(String[] args) {
      
    Scanner scanner = new Scanner(System.in);
  
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine().trim();


        if (frase.isEmpty() || !frase.contains(" ")) {
            System.out.println("No hay suficientes palabras para eliminar.");
        } else {
           
            int ultimaPosicionEspacio = frase.lastIndexOf(" ");

         
            String nuevaFrase = frase.substring(0, ultimaPosicionEspacio);

            System.out.println("Frase sin la última palabra: " + nuevaFrase);
        }

        scanner.close();

    }

}
