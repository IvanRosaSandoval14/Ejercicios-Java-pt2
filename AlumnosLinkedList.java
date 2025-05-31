import java.util.LinkedList;

public class AlumnosLinkedList {

      public static void main(String[] args) {
       
        LinkedList<Alumno> listaAlumnos = new LinkedList<>();

        listaAlumnos.add(new Alumno(101, "María López", "B001"));
        listaAlumnos.add(new Alumno(102, "Pedro Castillo", "B002"));
        listaAlumnos.add(new Alumno(103, "Lucía Mendoza", "B003"));

      
        System.out.println("Listado de alumnos :");
        for (Alumno alumno : listaAlumnos) {
            alumno.mostrarInformacion();
        }
    }
}
