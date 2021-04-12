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


    public Student() {
    }

    public Student(String name, CourseList currentCourses, CourseList completedCourses,
        HashMap<String, String> requisitesDone) {
        this.name = name;
        this.currentCourses = currentCourses;
        this.completedCourses = completedCourses;
        this.requisitesDone = requisitesDone;
        this.notcompletedCourses=pensum.getCourses();

    }

    public void addPensum(Pensum pensum) {
        this.pensum = pensum;
        validator = new CourseValidation(pensum, this);
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
}
