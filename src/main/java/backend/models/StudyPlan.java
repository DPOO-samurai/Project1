package backend.models;

import backend.util.CourseValidation;

public class StudyPlan {

    public CourseList courses;
    public CourseList completedCourses;
    public Pensum pensum;
    public CourseValidation validation;

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
            if (validation.isValid(c)) {
                courses.getCourses().add(c);
            }
        }
    }

    public void deleteCourse(String courseName) {
        Course c = pensum.searchCourse(courseName);
        if (c != null) {
            if (validation.isValid(c)) {
                courses.deleteCourse(c);
            }
        }
    }
}
