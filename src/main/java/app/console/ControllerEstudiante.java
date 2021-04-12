package app.console;

import backend.models.CourseList;
import backend.models.UsersController;
import backend.models.Student;

import java.util.ArrayList;

public class ControllerEstudiante {
    Student Estudiante_actual;
    UsersController Controller= new UsersController();
    /*public boolean searchStudent(){
        return Controller.;
    }*/
    public int getNumberofcredits(){
        return 0;
    }
    public void registerCourses(){

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
    public void isDegreecandidate() {
    }
    public void semesterPlanning() {
    }

}

