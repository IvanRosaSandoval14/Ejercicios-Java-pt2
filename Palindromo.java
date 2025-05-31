public class Palindromo {
public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);
    
    System.out.println("Ingresa una palabra para verificar si es un palíndromo. Escribe 'salir' para terminar.");
    
    while (true) {
        System.out.print("\nIngresa una cadena: ");
        String cadena = scanner.nextLine().trim();
        
        // Verifica si el usuario quiere salir
        if (cadena.equalsIgnoreCase("salir")) {
            System.out.println("Programa finalizado.");
            break;
        }
        
        // Elimina espacios y convierte a minúsculas
        String cadenaSinEspacios = cadena.replaceAll("\\s+", "").toLowerCase();
        
        // Verifica si es un palíndromo
        StringBuilder reverso = new StringBuilder(cadenaSinEspacios).reverse();
        
        if (cadenaSinEspacios.equals(reverso.toString())) {
            System.out.println("La cadena es un palíndromo.");
        } else {
            System.out.println("La cadena no es un palíndromo.");
        }
    }
    
    scanner.close();
} 
}
