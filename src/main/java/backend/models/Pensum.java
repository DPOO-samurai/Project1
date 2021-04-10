package backend.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Pensum {

    public String pensumName;
    public ArrayList<Course> courses;
    public String graduationRequisites;

    public Pensum(String pensumName, String path) {
        this.pensumName = pensumName;
        this.courses = loadPensum(path);
    }

    private ArrayList<Course> loadPensum(String path) {
        return new ArrayList<Course>();
    }
}
