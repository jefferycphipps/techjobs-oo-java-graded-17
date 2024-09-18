package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String na, Employer emp, Location loc, PositionType pos, CoreCompetency core){
        this();
        name = na;
        employer = emp;
        location = loc;
        positionType = pos;
        coreCompetency = core;
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
        return Objects.hashCode(id);
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public String toString(){
        int printID = this.id;
        String printName;
        String printEmployer;
        String printLocation;
        String printPosition;
        String printCore;

        if((this.name==null||this.name=="")&&(this.employer.getValue()==null||this.employer.getValue()=="")&&(this.location.getValue()==null||this.location.getValue()=="")
                &&(this.positionType.getValue()==null||this.positionType.getValue()=="")&&(this.coreCompetency.getValue()==null||this.coreCompetency.getValue()==""))
            return "OOPS! This job does not seem to exist";

        if (this.name==null||this.name=="")
            printName = "Data not available";
        else
            printName = this.name;

        if (this.employer==null||this.employer.getValue()==""||this.employer.getValue()==null)
            printEmployer = "Data not available";
        else
            printEmployer = this.employer.getValue();

        if (this.location==null||this.location.getValue()==""||this.location.getValue()==null)
            printLocation = "Data not available";
        else
            printLocation = this.location.getValue();

        if (this.positionType==null||this.positionType.getValue()==""||this.positionType.getValue()==null)
            printPosition = "Data not available";
        else
            printPosition = this.positionType.getValue();

        if (this.coreCompetency==null||this.coreCompetency.getValue()==""||this.coreCompetency.getValue()==null)
            printCore = "Data not available";
        else
            printCore = this.coreCompetency.getValue();

        String s = System.lineSeparator() +
                "ID: "+ printID + System.lineSeparator() +
                "Name: " + printName + System.lineSeparator() +
                "Employer: " + printEmployer + System.lineSeparator() +
                "Location: " + printLocation + System.lineSeparator() +
                "Position Type: " + printPosition + System.lineSeparator() +
                "Core Competency: " + printCore + System.lineSeparator();

        return s;
    }
}
