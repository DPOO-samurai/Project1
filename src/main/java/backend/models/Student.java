package backend.models;

import java.util.HashMap;


public class Student {

    public String name;
    public CourseList currentCourses;
    public CourseList completedCourses;
    public HashMap<String, String> requisitesDone;

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
