package backend.util;

import backend.models.Course;
import backend.models.CourseList;
import backend.models.Pensum;
import backend.models.Student;
import backend.models.StudyPlan;
import java.util.ArrayList;

public class CourseValidation {

    public Pensum pensum;
    public Student student;

    public CourseValidation(Pensum pensum, Student student) {
        this.pensum = pensum;
        this.student = student;
    }

    public boolean isValid(Course course) {
        return isValid(course, null);
    }

    public boolean isValid(Course course, StudyPlan actualPlan) {
        if (pensum.courseExist(course)) {
            student.getCompletedRequirements();
            lc = course.getRequirements();
            for (var course : lc)
            {

            }
        }

        return false;
    }
}