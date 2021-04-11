package backend.models;

import java.util.ArrayList;

public class StudyPlan {

    public ArrayList<Course> courses;
    public ArrayList<String> completedCourses;

    public StudyPlan() {

    }

    public StudyPlan(ArrayList<Course> courses, ArrayList<String> completedCourses) {
        this.courses = courses;
        this.completedCourses = completedCourses;
    }

    public void addCourse(Course course) {

    }

    public void deleteCourse(Course course) {

    }
}
