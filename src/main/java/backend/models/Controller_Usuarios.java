package backend.models;

import java.util.ArrayList;
import java.util.ListIterator;

public class Controller_Usuarios {
    ArrayList<Student> Lista_estudiantes= new ArrayList<Student>();
    ArrayList<Maestro> Lista_Maestros= new ArrayList<Maestro>();

    public Student darEstudiante(String Nombre_Estudiante){
        ListIterator<Student> it = Lista_estudiantes.listIterator();
        while (it.hasNext()) {
            Student nuevo = it.next();
            String nombre_nuevo_Estudiante=nuevo.getName();
            if (nombre_nuevo_Estudiante.equals(Nombre_Estudiante)) {
                System.out.println("se ha encontrado el estudiante");
                return nuevo;
            }
        }
        System.out.println("no se ha encontrado el estudiante");
        return null;
    }
    public Maestro darMaestro(String Nombre_Maestro){
        ListIterator<Maestro> it = Lista_Maestros.listIterator();
        while (it.hasNext()) {
            Maestro nuevo = it.next();
            String nombre_nuevo_Maestro=nuevo.getName();
            if (nombre_nuevo_Maestro.equals(Nombre_Maestro)) {
                System.out.println("se ha encontrado el Maestro");
                return nuevo;
            }
        }
        System.out.println("no se ha encontrado el Maestro");
        return null;
    }
}
