package backend.models;

import java.util.ArrayList;
import java.util.ListIterator;

public class StudentStatus {
    public ArrayList<String> currentCourses;
    public ArrayList<String> completedCourses;

    public boolean verificar_requisitos(ArrayList<String> requisitos){
        ListIterator<String> ite = requisitos.listIterator();
        while (ite.hasNext()) {
            String requisito_nuevo = ite.next();
            ListIterator<String> it = completedCourses.listIterator();
            while (it.hasNext()) {
                String cursos_hechos = it.next();
                if (requisito_nuevo.equals(cursos_hechos)) {
                    System.out.println("se ha encontrado el estudiante");
                    break;
                }
                else if(ite.hasNext()==false){
                    System.out.println("no se ha encontrado el estudiante");
                    return false;
                }
            }
        }
        return true;
    }

}
