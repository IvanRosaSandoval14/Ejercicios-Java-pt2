import java.util.Scanner;

public class Promedioypositivos {

     public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

      double suma = 0;
        int cantidad = 0;
        int positivos = 0;

          System.out.println("Ingresa valores numéricos. Escribe 'salir' para terminar.");
  while (true) {
            System.out.print("Número: ");
            String entrada = scanner.nextLine();

            if (entrada.equalsIgnoreCase("salir")) {
                break;
            }

            try {
                double numero = Double.parseDouble(entrada);  // Convertir texto a número

                suma += numero;
                cantidad++;

                if (numero > 0) {
                    positivos++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor ingresa un número o 'salir'.");
            }
        }

        if (cantidad > 0) {
            double promedio = suma / cantidad;
            System.out.println("\nCantidad total de números ingresados: " + cantidad);
            System.out.println("Promedio de los números: " + promedio);
            System.out.println("Cantidad de números positivos: " + positivos);
        } else {
            System.out.println("No se ingresaron números válidos.");
        }

        scanner.close();
     }
}
