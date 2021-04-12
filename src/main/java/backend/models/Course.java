package backend.models;

import java.util.ArrayList;

public class Course {

    public String id;
    public String name;
    public int credits;
    public ArrayList<String> attributes;
    public ArrayList<String> prerequisites;
    public ArrayList<String> corequisites;

    public Course() {
    }

    public Course(String id, String name, int credits, ArrayList<String> attributes,
        ArrayList<String> prerequisites, ArrayList<String> corequisites) {
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.attributes = attributes;
        this.prerequisites = prerequisites;
        this.corequisites = corequisites;
    }

    public Course(Course course) {
        this(course.id, course.name, course.credits, course.attributes, course.prerequisites,
            course.corequisites);
    }
}
