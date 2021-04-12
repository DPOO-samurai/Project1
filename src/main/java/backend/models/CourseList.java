package backend.models;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class CourseList {

    private ArrayList<Course> courses;

    public CourseList() {
    }

    public CourseList(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @JsonIgnore
    public ArrayList<String> getIds() {
        var idList = new ArrayList<String>();
        for (var course : courses) {
            idList.add(course.id);
        }
        return idList;
    }

    @JsonIgnore
    public ArrayList<String> getNames() {
        var nameList = new ArrayList<String>();
        for (var course : courses) {
            nameList.add(course.name);
        }
        return nameList;
    }

    @JsonIgnore
    public int getTotalCredits() {
        int total = 0;
        for (var course : courses) {
            total += course.credits;
        }
        return total;
    }

    @JsonIgnore
    public ArrayList<String> getAttributes() {
        var nameList = new ArrayList<String>();
        for (var course : courses) {
            nameList.add(course.name);
        }
        return nameList;
    }

    @JsonIgnore
    public ArrayList<String> getRequisites() {
        var requisiteList = new ArrayList<String>();
        for (var course : courses) {
            requisiteList.addAll(getPrerequisites());
            requisiteList.addAll(getCorequisites());
        }
        return requisiteList;
    }

    @JsonIgnore
    public ArrayList<String> getPrerequisites() {
        var prerequisiteList = new ArrayList<String>();
        for (var course : courses) {
            prerequisiteList.addAll(course.prerequisites);
        }
        return prerequisiteList;
    }

    @JsonIgnore
    public ArrayList<String> getCorequisites() {
        var corequisiteList = new ArrayList<String>();
        for (var course : courses) {
            corequisiteList.addAll(course.corequisites);
        }
        return corequisiteList;
    }

    public boolean courseExist(String courseName) {
        boolean flag = false;
        for (var course : courses) {
            if (courseName.equals(course.id)) {
                flag = true;
                break;
            }
        }
        return flag;
    }
}
