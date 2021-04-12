package backend.models;

import backend.util.CourseValidation;

import java.util.ArrayList;

public class StudyPlan {

    public CourseList courses= new CourseList();
    public CourseList completedCourses= new CourseList();
    public Pensum pensum;
    public CourseValidation validation;
    public ArrayList<String> missingCorequisites = new ArrayList<String>();

    public StudyPlan() {

    }

    public StudyPlan(CourseList courses, CourseList completedCourses, Pensum pensum,
        CourseValidation courseValidation) {
        this.courses = courses;
        this.completedCourses = completedCourses;
        this.pensum = pensum;
        this.validation = courseValidation;
    }

    public void addCourse(String courseName) {
        Course c = pensum.searchCourse(courseName);
        if (c != null) {
            if (validation.isValid(c,completedCourses,missingCorequisites)) {
                courses.getCourses().add(c);
            }
        }
    }
    //hay que modificar esta parte para verificar si no hya cosas que dependan de ella
    public void deleteCourse(String courseName) {
        Course c = pensum.searchCourse(courseName);
        if (c != null) {
            if (validation.isValid(c,completedCourses,missingCorequisites)) {
                courses.deleteCourse(c);
            }
        }
    }
}
