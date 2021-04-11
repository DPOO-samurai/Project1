package backend.util;

import backend.models.Course;
import backend.models.Pensum;
import java.util.ArrayList;

public class CourseValidation {

    public Pensum pensum;
    public ArrayList<String> completedCourses;

    public CourseValidation(Pensum pensum, ArrayList<String> completedCourses) {
        this.pensum = pensum;
        this.completedCourses = completedCourses;
    }

    public boolean isValid(Course course) {
        return isValid(course, new ArrayList<Course>());
    }

    public boolean isValid(Course course, ArrayList<Course> actualPlans) {
        if (pensum.courseExist()) {
            student.getCompletedRequirements()
            lc = course.getRequirements();
            for (var course : lc)
            {

            }
        }
    }
}