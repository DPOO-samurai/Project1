package app.console;

import backend.Global;
import backend.models.CourseList;
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
import java.util.Scanner;
import java.util.stream.Collectors;

public class ConsoleApp {

    public static void Pesumform() throws IOException {
        var objectMapper = new ObjectMapper();

        var quantifiedAttributes = new HashMap<String, Integer>();
        quantifiedAttributes.put("CBPC", 2);

        var qualifiedAttributes = new ArrayList<String>();
        qualifiedAttributes.add("epsilon");

        var graduationRequisites = new GraduationRequisites(1,
            quantifiedAttributes, qualifiedAttributes);
        objectMapper
            .writeValue(new File("C:\\tmp_java\\graduation_requisites.json"),
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

        var sCourse = new StudentCourse(course, 30);
        objectMapper
            .writeValue(new File("C:\\tmp_java\\student_course.json"),
                sCourse);
        System.out.println("student_course.json written");

        var jsontext = Files.lines(Path.of("C:\\tmp_java\\student_course.json"))
            .collect(
                Collectors.joining());
        StudentCourse testjson = objectMapper.readValue(jsontext, StudentCourse.class);

        var json_pensum = Files.lines(Path.of("C:\\tmp_java\\pensum.json"))
            .collect(
                Collectors.joining());
        Pensum test_pensum = objectMapper.readValue(json_pensum, Pensum.class);

        /*var json_pensum_t = Files.lines(Path.of("C:\\tmp_java\\json_pensum_test.json"))
            .collect(
                Collectors.joining());
        Pensum test_pensum_t = objectMapper.readValue(json_pensum_t, Pensum.class);
*/
        System.out.println(Global.rootPath);
    }
}
