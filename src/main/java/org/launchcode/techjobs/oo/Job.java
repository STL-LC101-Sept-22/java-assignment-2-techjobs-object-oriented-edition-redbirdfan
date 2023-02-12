package org.launchcode.techjobs.oo;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private static String name;
    private String employer;
    private String location;
    private String positionType;
    private String coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, String employer, String location, String positionType, String coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;

    }
    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public static String getName() {
        return name;
    }

    public String getEmployer() {
        return employer;
    }

    public String getLocation() {
        return location;
    }

    public String getPositionType() {
        return positionType;
    }

    public String getCoreCompetency() {
        return coreCompetency;
    }


    public void setName(String name) {
        this.name = name;
    }
    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(String coreCompetency) {
        this.coreCompetency = coreCompetency;
        }


    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        String[] Fields = {name, employer, location, positionType, coreCompetency};
                for (int i = 0; i < Fields.length; i++) {
                    if (Fields[i] == "") {
                        Job[i] = "Data not available";
                    }
                    }


        return ("\n" + "ID: " + getId() +
                "\n" + "Name: " + Fields[0] +
                "\n" + "Employer: " + Fields[1] +
                "\n" + "Location: " + Fields[2] +
                "\n" + "Position Type: " + Fields[3] +
                "\n" + "Core Competency: " + Fields[4] + "\n");
    }
}
