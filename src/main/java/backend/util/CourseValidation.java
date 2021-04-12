package backend.util;

import backend.models.Course;
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

    public boolean isValid(Course c, StudyPlan actualPlan) {
        boolean flag = false;

        if (pensum.courseExist(c.id)) {
            student.getCompletedRequirements();
            ArrayList<String> courseRequisites = c.getRequisites();
            for (var course : courseRequisites) {
                if (c.id.equals(course)) {
                    flag = true;
                    break;
                }
            }
        }

        return flag;
    }
}