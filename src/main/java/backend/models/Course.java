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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public ArrayList<String> getAttributes() {
        return attributes;
    }

    public void setAttributes(ArrayList<String> attributes) {
        this.attributes = attributes;
    }

    public ArrayList<String> getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(ArrayList<String> prerequisites) {
        this.prerequisites = prerequisites;
    }

    public ArrayList<String> getCorequisites() {
        return corequisites;
    }

    public void setCorequisites(ArrayList<String> corequisites) {
        this.corequisites = corequisites;
    }

    public ArrayList<String> getRequisites() {
        var tmp = new ArrayList<String>();
        tmp.addAll(prerequisites);
        tmp.addAll(corequisites);

        return tmp;
    }
}
