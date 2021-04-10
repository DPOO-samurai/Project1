package backend.models;

import java.util.ArrayList;
import java.util.HashMap;

public class GraduationRequisites {

    public int credits;

    public HashMap<String, Integer> quantifiedAttributes;

    public ArrayList<String> qualifiedattributes;

    public GraduationRequisites(int credits, HashMap<String, Integer> quantifiedAttributes,
        ArrayList<String> qualifiedattributes) {
        this.credits = credits;
        this.quantifiedAttributes = quantifiedAttributes;
        this.qualifiedattributes = qualifiedattributes;
    }
}
