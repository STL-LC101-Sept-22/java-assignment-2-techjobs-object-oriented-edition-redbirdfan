package org.launchcode.techjobs.oo;
import javax.swing.text.Position;
import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private static String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(int id, String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
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
        if(name == ""){
            return "Data not available";
        } else
            return name;
    }

    public String getEmployer(){
        if(getEmployer() == ""){
            return "Data not available";
        } else
            return getEmployer();
    }

    public String getLocation() {
        if (getLocation() == "") {
            return "Data not available";
        } else
            return getLocation();
    }
    public String getPositionType(){
        if(getPositionType() == ""){
        return "Data not available";
        } else
        return getPositionType();
        }

    public String getCoreCompetency() {
        if(getCoreCompetency() == ""){
            return "Data not available";
        } else
                return getCoreCompetency();
        }



    public void setName(String name) {
        this.name = name;
    }
    public void setEmployer(String employer) {
        this.employer = Employer().employer;
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


        return ("\n" + "ID: " + getId() +
                "\n" + "Name: " + getName() +
                "\n" + "Employer: " + getEmployer() +
                "\n" + "Location: " + getLocation() +
                "\n" + "Position Type: " + getPositionType() +
                "\n" + "Core Competency: " + getCoreCompetency() + "\n");
    }
}
