package backend.util;

import backend.models.Course;
import backend.models.CourseList;
import backend.models.Pensum;
import backend.models.Student;
import backend.models.StudyPlan;
import java.util.ArrayList;
import java.util.Iterator;

public class CourseValidation {

    public Pensum pensum;
    public CourseList realizados;

    public CourseValidation(Pensum pensum, CourseList realizados) {
        this.pensum = pensum;
        this.realizados=realizados;
    }

    public boolean isValid(Course c, CourseList cursosCompletados , ArrayList<String> missingCorequisites) {

        if (pensum.courseExist(c.id)) {
            var listaRealizados=realizados.getIds();
            ArrayList<String> preRequisites= c.getPrerequisites();
            ArrayList<String> corequisites=c.getCorequisites();
            ArrayList<String> completeids=cursosCompletados.getIds();
            Iterator<String> it = preRequisites.iterator();
            //se encarga de pre requisitos

            while (it.hasNext()){
                String next =it.next();
                if (completeids.contains(next)) {
                    System.out.println("");
                }
                else{
                    return false;
                }
            }
            //se encarga de corequisitos
            for (var course : corequisites) {
                if (missingCorequisites.contains(course)){
                    missingCorequisites.remove(missingCorequisites.indexOf(course));
                }
                else{
                    missingCorequisites.add(course);
                }
            }return true;

        }return false;
    }
}