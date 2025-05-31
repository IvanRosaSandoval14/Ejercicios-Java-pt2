import java.util.Scanner;

public class ContarA {
  public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);

    System.out.println("Escribe frases para contar la letra 'a'. Escribe 'salir' para terminar.");

    while (true) {
      System.out.print("\nIngresa una frase: ");
      String frase = scanner.nextLine();

      // Verifica si el usuario quiere salir
      if (frase.equalsIgnoreCase("salir")) {
        System.out.println("Programa finalizado.");
        break;
      }

      // Cuenta las ocurrencias de la letra 'a'
      int contador = 0;
      for (char c : frase.toCharArray()) {
        if (Character.toLowerCase(c) == 'a') {
          contador++;
        }
      }

      System.out.println("Cantidad de letras 'a': " + contador);
    }

    scanner.close();

  }

}
