package backend.models;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;

public class Student {
    public String Name;
    public ArrayList<String> currentCourses;
    public ArrayList<String> completedCourses;
    public HashMap<String, String> requisitos_ya_cumplidos;

    public boolean verificarRequisitos(ArrayList<String> requisitos){
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
    public HashMap<String,String>getRequisitos_ya_cumplidos(){
        return requisitos_ya_cumplidos;
    }

    public String getName() {
        return Name;
    }
    public String nickname;
    public String Name;
}
