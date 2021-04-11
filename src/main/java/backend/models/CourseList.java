package backend.models;

import java.util.ArrayList;

public class CourseList {

    private ArrayList<Course> courses;

    public CourseList(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<String> getIds() {
        var idList = new ArrayList<String>();
        for (var course : courses) {
            idList.add(course.id);
        }
        return idList;
    }

    public ArrayList<String> getNames() {
        var nameList = new ArrayList<String>();
        for (var course : courses) {
            nameList.add(course.name);
        }
        return nameList;
    }

    public int getTotalCredits() {
        int total = 0;
        for (var course : courses) {
            total += course.credits;
        }
        return total;
    }

    public ArrayList<String> getAttributes() {
        var nameList = new ArrayList<String>();
        for (var course : courses) {
            nameList.add(course.name);
        }
        return nameList;
    }

    public ArrayList<String> getRequisites() {
        var requisiteList = new ArrayList<String>();
        for (var course : courses) {
            requisiteList.addAll(getPrerequisites());
            requisiteList.addAll(getCorequisites());
        }
        return requisiteList;
    }

    public ArrayList<String> getPrerequisites() {
        var prerequisiteList = new ArrayList<String>();
        for (var course : courses) {
            prerequisiteList.addAll(course.prerequisites);
        }
        return prerequisiteList;
    }

    public ArrayList<String> getCorequisites() {
        var corequisiteList = new ArrayList<String>();
        for (var course : courses) {
            corequisiteList.addAll(course.corequisites);
        }
        return corequisiteList;
    }
}
