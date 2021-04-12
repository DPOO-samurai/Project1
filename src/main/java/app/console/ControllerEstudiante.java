package app.console;

import backend.models.CourseList;
import backend.models.UsersController;
import backend.models.Student;

import java.util.ArrayList;
import java.util.HashMap;

public class ControllerEstudiante {
    Student Estudiante_actual;
    UsersController Controller= new UsersController();
    /*public boolean searchStudent(){
        return Controller.;
    }*/
    public int getNumberofcredits(){
        return 0;
    }
    public HashMap<String, String> requirementsAlreadymet(){
        return Estudiante_actual.getRequisitesDone();
    }
    /*public HashMap<String, String> getRequisitos_ya_cumplidos(){

    }
    */
    public CourseList coursesDone() {
        return Estudiante_actual.getCompletedCourses();
    }
    public CourseList coursesNotdone() {
        return Estudiante_actual.getnotcompletedCourses();
    }
    public boolean isDegreecandidate() {
        return false;
    }

    public void semesterPlanning(int casesemester, int semesterNumber, String id) {
        switch(casesemester) {
            //el caso 0 elimina el caso 1 agrega
            case 0:
                Estudiante_actual.nuevoPlan(semesterNumber);
                Estudiante_actual.deleteCourse(id);
                break;
            case 1:
                Estudiante_actual.nuevoPlan(semesterNumber);
                Estudiante_actual.addcourse(id);
                break;
            default:
                // code block
        }
    }

}

