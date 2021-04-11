package backend.models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

public class Student {

    public String name;
    public ArrayList<String> currentCourses;
    public ArrayList<String> completedCourses;
    public HashMap<String, String> requisitesDone;

    public boolean verifyRequisites(ArrayList<String> requisites) {
        ListIterator<String> ite = requisites.listIterator();
        while (ite.hasNext()) {
            String requisito_nuevo = ite.next();
            ListIterator<String> it = completedCourses.listIterator();
            while (it.hasNext()) {
                String cursos_hechos = it.next();
                if (requisito_nuevo.equals(cursos_hechos)) {
                    System.out.println("se ha encontrado el estudiante");
                    break;
                } else if (ite.hasNext() == false) {
                    System.out.println("no se ha encontrado el estudiante");
                    return false;
                }
            }
        }
        return true;
    }

    public HashMap<String, String> getRequisitesdone() {
        return requisitesDone;
    }

    public String getName() {
        return name;
    }

    public String getCompletedRequirements() {
        return new String();
    }
}
