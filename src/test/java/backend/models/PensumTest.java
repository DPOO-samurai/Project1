package backend.models;

import static org.junit.jupiter.api.Assertions.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.Test;

class PensumTest {

    @Test
    public void PensumJsonSerializeCheck() throws IOException {
        var objectMapper = new ObjectMapper();

        var quantifiedAttributes = new HashMap<String, Integer>();
        quantifiedAttributes.put("CBPC", 2);
        var qualifiedAttributes = new ArrayList<String>();
        qualifiedAttributes.add("epsilon");

        var graduationRequisites = new GraduationRequisites(20,
            quantifiedAttributes, qualifiedAttributes);

        objectMapper
            .writeValue(new File("C:\\tmp_java\\test\\graduation_requisites.json"),
                graduationRequisites);

        System.out.println("graduation_requisites.json written");

        var attributes = new ArrayList<String>();
        attributes.add("epsilon");

        var prerequisites = new ArrayList<String>();
        prerequisites.add("EDA");

        var corequisites = new ArrayList<String>();
        corequisites.add("Estructural");

        var course = new Course("ISIS-xxxx", "DPOO", 3, attributes, prerequisites, corequisites);
        objectMapper
            .writeValue(new File("C:\\tmp_java\\course.json"),
                course);
        System.out.println("course.json written");

        var courseList = new ArrayList<Course>();
        courseList.add(course);
        var clWrapper = new CourseList(courseList);

        var pensum = new Pensum("ISIS", clWrapper, graduationRequisites);
        objectMapper
            .writeValue(new File("C:\\tmp_java\\pensum.json"),
                pensum);
        System.out.println("pensum.json written");
    }
}