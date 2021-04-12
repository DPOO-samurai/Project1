package backend.models;

import backend.util.CourseValidation;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;
import java.util.HashMap;


public class Student {

    public String name;
    public CourseList currentCourses;
    public CourseList notcompletedCourses;
    public CourseList completedCourses;
    public HashMap<String, String> requisitesDone;
    @JsonIgnore
    public CourseValidation validator;
    @JsonIgnore
    public Pensum pensum;
    public ArrayList<StudyPlan> studyPlanlist=new ArrayList<StudyPlan>();
    public StudyPlan actualPlan;


    public Student() {
    }
    //mejorar el not completedCourses no es lo que se le pone
    public Student(String name, CourseList currentCourses, CourseList completedCourses,
        HashMap<String, String> requisitesDone, Pensum pensum) {
        this.name = name;
        this.currentCourses = currentCourses;
        this.completedCourses = completedCourses;
        this.requisitesDone = requisitesDone;
        this.notcompletedCourses=pensum.getCourses();
        this.pensum=pensum;
        this.validator= new CourseValidation(pensum,completedCourses);
        for (int i = 0; i < 20; ++i) {
            studyPlanlist.add(new StudyPlan(pensum.getCourses(), completedCourses,pensum,validator));
        }
    }
    public void nuevoPlan(int numeroSemestre){
        actualPlan=studyPlanlist.get(numeroSemestre+1);
    }
    //añadir el funcionamiento de delete y add
    public void deleteCourse(String id){

    }
    public void addcourse(String id){

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
    public CourseList getCurrentCourses() {
        return currentCourses;
    }

    public CourseList getCompletedCourses() {
        return completedCourses;
    }

    public CourseList getnotcompletedCourses() {
        return notcompletedCourses;
    }
    public HashMap<String, String> getRequisitesDone() {
        return requisitesDone;
    }

    public StudyPlan getActualPlan() {
        return actualPlan;
    }
}
