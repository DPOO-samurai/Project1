package app.console;

import backend.Global;
import backend.models.Pensum;
import backend.models.Course;
import backend.models.GraduationRequisites;
import backend.models.StudentCourse;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.stream.Collectors;

public class ConsoleApp {

    public static void main(String[] args) throws IOException {
        var objectMapper = new ObjectMapper();

        var quantifiedAttributes = new HashMap<String, Integer>();
        quantifiedAttributes.put("CBPC", 2);

        var qualifiedAttributes = new ArrayList<String>();
        qualifiedAttributes.add("epsilon");

        var graduationRequisites = new GraduationRequisites(1,
            quantifiedAttributes, qualifiedAttributes);
        objectMapper
            .writeValue(new File("C:\\Users\\idbl6\\Desktop\\test\\graduation_requisites.json"),
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
            .writeValue(new File("C:\\Users\\idbl6\\Desktop\\test\\course.json"),
                course);
        System.out.println("course.json written");

        var courseList = new ArrayList<Course>();
        courseList.add(course);

        var pensum = new Pensum("ISIS", courseList, graduationRequisites);
        objectMapper
            .writeValue(new File("C:\\Users\\idbl6\\Desktop\\test\\pensum.json"),
                pensum);
        System.out.println("pensum.json written");

        var sCourse = new StudentCourse(course, 30);
        objectMapper
            .writeValue(new File("C:\\Users\\idbl6\\Desktop\\test\\student_course.json"),
                sCourse);
        System.out.println("student_course.json written");

        var jsontext = Files.lines(Path.of("C:\\Users\\idbl6\\Desktop\\test\\student_course.json")).collect(
            Collectors.joining());


        StudentCourse testjson = objectMapper.readValue(jsontext, StudentCourse.class);

        System.out.println(Global.rootPath);
    }
}
