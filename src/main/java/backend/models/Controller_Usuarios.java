package backend.models;

import java.util.ArrayList;
import java.util.ListIterator;

public class Controller_Usuarios {
    ArrayList<Student> Lista_estudiantes= new ArrayList<Student>();
    ArrayList<Maestro> Lista_Maestros= new ArrayList<Maestro>();

    public boolean Exite_estudiante(){


    }
    public boolean Exite_Maestros(){


    }
    public Student Dar_estudiante(){
        ListIterator<Student> it = Lista_estudiantes.listIterator();
        while (it.hasNext()) {
            Student nuevo = it.next();
            if (nuevo.getId().equals(nombre)) {
                System.out.println("se ha encontrado el estudiante");
                return nuevo;
            }
        }
    }
    public Maestro Dar_Maestro(){

    }
}
