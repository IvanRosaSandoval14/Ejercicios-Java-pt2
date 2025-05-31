import java.util.Scanner;

public class CadenaSustituida {
 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

System.out.println("Ingresa una cadena de texto para sustituir palabras. Escribe 'salir' para terminar.");

        System.out.print("Ingresa una cadena: ");
        String entrada = scanner.nextLine().toLowerCase();  

         StringBuilder resultado = new StringBuilder(); 

           boolean capitalizar = true;

        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);

            if (Character.isLetter(c) && capitalizar) {
                resultado.append(Character.toUpperCase(c));
                capitalizar = false;
            } else {
                resultado.append(c);
            }

         
            if (c == ' ') {
                capitalizar = true;
            }
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();

 }

}
