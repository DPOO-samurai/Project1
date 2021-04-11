package backend.models;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.nio.file.Path;
import java.util.ArrayList;

public class Pensum {

    public String pensumName;
    public ArrayList<Course> courses;
    public GraduationRequisites graduationRequisites;

    public Pensum() {
    }

    public Pensum(String pensumName, ArrayList<Course> courses,
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
}
