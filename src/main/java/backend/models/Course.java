package backend.models;

import java.util.ArrayList;

public class Course {

    public String id;
    public String name;
    public byte credits;
    public ArrayList<String> attributes;
    public ArrayList<String> prerequisites;
    public ArrayList<String> corequisites;
}
