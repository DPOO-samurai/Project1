package backend.models;

import java.util.ArrayList;

public class Pensum {

    public String pensumName;
    public ArrayList<Course> courses;
    public GraduationRequisites graduationRequisites;


    public Pensum(String pensumName, ArrayList<Course> courses,
        GraduationRequisites graduationRequisites) {
        this.pensumName = pensumName;
        this.courses = courses;
        this.graduationRequisites = graduationRequisites;
    }

    public Pensum(String pensumName, String path) {
        this.pensumName = pensumName;
        this.courses = loadPensum(path);
    }


    private ArrayList<Course> loadPensum(String path) {
        return new ArrayList<Course>();
    }
}
