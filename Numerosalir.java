import java.util.Scanner;
import java.util.TreeSet;

public class Numerosalir {

      public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<Integer> numeros = new TreeSet<>();

        System.out.println("Ingresa números. Escribe 'salir' para terminar:");

        while (true) {
            System.out.print("Número: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                int numero = Integer.parseInt(entrada);
                numeros.add(numero); // Se agrega al TreeSet (automáticamente ordenado y sin duplicados)
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Ingresa un número entero o 'salir'.");
            }
        }

        // Mostrar los números ordenados
        System.out.println("\nNúmeros ordenados de menor a mayor:");
        for (int num : numeros) {
            System.out.println(num);
        }

        scanner.close();
    }

  }
