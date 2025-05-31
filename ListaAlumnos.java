import java.util.ArrayList;

public class ListaAlumnos {

     public static void main(String[] args) {

        ArrayList<Alumno> listaAlumnos = new ArrayList<>();

        
        listaAlumnos.add(new Alumno(1, "Ivan Rosa", "A001"));
        listaAlumnos.add(new Alumno(2, "Abigail Torres", "A002"));
        listaAlumnos.add(new Alumno(3, "Carlos Navarro", "A003"));

         System.out.println("Listado de alumnos:");
        for (Alumno alumno : listaAlumnos) {
            alumno.mostrarInformacion();
        }
     } 
}
