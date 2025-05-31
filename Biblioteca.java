import java.util.LinkedHashSet;

public class Biblioteca {

     public static void main(String[] args) {
        LinkedHashSet<Libro> biblioteca = new LinkedHashSet<>();

     
        biblioteca.add(new Libro(1, "Cien Años de Soledad", "1ra", "Gabriel García Márquez"));
        biblioteca.add(new Libro(2, "Don Quijote de la Mancha", "3ra", "Miguel de Cervantes"));
        biblioteca.add(new Libro(3, "La Odisea", "2da", "Homero"));
        biblioteca.add(new Libro(1, "Cien Años de Soledad", "1ra", "Gabriel García Márquez")); // Duplicado por ID


        System.out.println("Lista de libros en la biblioteca:");
        for (Libro libro : biblioteca) {
            libro.mostrarLibro();
        }
    }
}
