package backend.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.ListIterator;

public class Pensum {

    public String pensumName;
    @JsonUnwrapped
    public CourseList courses;
    public GraduationRequisites graduationRequisites;

    public Pensum() {
    }

    public Pensum(String pensumName, CourseList courses,
        GraduationRequisites graduationRequisites) {
        this.pensumName = pensumName;
        this.courses = courses;
        this.graduationRequisites = graduationRequisites;
    }

    public static Pensum loadPensum(String pensumName) throws JsonProcessingException {
        var rootPath = Path.of(System.getProperty("user.dir")).getParent() + "/data";
        var objectMapper = new ObjectMapper();
        return objectMapper.readValue(rootPath + pensumName, Pensum.class);
    }

    public Course searchCourse(String nombre) {
        for (var course : courses.getCourses()) {
            if (nombre.equals(course.id)) {
                System.out.println("se ha encontrado el curso");
                return course;
            }
        }
        System.out.println("No se ha encontrado el curso");

        return null;
    }

    public boolean courseExist(String course) {
        return courses.courseExist(course);
    }
}

