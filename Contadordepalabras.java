import java.util.Scanner;

public class Contadordepalabras {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase;

        System.out.println("Escribe frases para contar palabras. Escribe 'salir' para terminar.");

        while (true) {
            System.out.print("\nIngresa una frase: ");
            frase = scanner.nextLine();

            // Verifica si el usuario quiere salir
            if (frase.equalsIgnoreCase("salir")) {
                System.out.println("Programa finalizado.");
                break;
            }

            // Divide y cuenta las palabras
            String[] palabras = frase.trim().split("\\s+");
            int cantidadPalabras = frase.trim().isEmpty() ? 0 : palabras.length;

            System.out.println("Cantidad de palabras: " + cantidadPalabras);
        }

        scanner.close();


}
}
