import java.util.Objects;

public class Libro {

     private int id;
    private String titulo;
    private String edicion;
    private String autor;

    
    public Libro(int id, String titulo, String edicion, String autor) {
        this.id = id;
        this.titulo = titulo;
        this.edicion = edicion;
        this.autor = autor;
    }


    public int getId() {
        return id;
    }


    public String getTitulo() {
        return titulo;
    }


    public String getEdicion() {
        return edicion;
    }


    public String getAutor() {
        return autor;
    }

     public void mostrarLibro() {
        System.out.println("ID: " + id + ", Título: " + titulo +
                           ", Edición: " + edicion + ", Autor: " + autor);
     }

     @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Libro)) return false;
        Libro otro = (Libro) obj;
        return this.id == otro.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
    
}
