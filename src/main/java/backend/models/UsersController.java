package backend.models;

import java.util.ArrayList;
import java.util.ListIterator;

public class UsersController {
    ArrayList<Student> studentList= new ArrayList<Student>();
    ArrayList<Teacher> TeachersList = new ArrayList<Teacher>();
    public Student giveStudent(String Nombre_Estudiante){
        ListIterator<Student> it = studentList.listIterator();
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
    public Teacher giveTeacher(String Nombre_Maestro){
        ListIterator<Teacher> it = TeachersList.listIterator();
        while (it.hasNext()) {
            Teacher nuevo = it.next();
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
