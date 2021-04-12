package backend.models;

public class StudentCourse extends Course {
    public int grade;

    public StudentCourse() {
    }

    public StudentCourse(Course course, int grade) {
        super(course);
        this.grade = grade;
    }
}
