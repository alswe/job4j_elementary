package ru.job4j.oop;

public class Builder extends Engineer {
    private boolean hasBuildingPermit;
    private int numberOfEmployees;

    public Builder(String name, String surname, String education, String birthday, boolean isLicensedNeeded, boolean hasBuildingPermit, int numberOfEmployees) {
        super(name, surname, education, birthday, true);
        this.hasBuildingPermit = hasBuildingPermit;
        this.numberOfEmployees = numberOfEmployees;
    }

    public boolean getHasBuildingPermit() {
        return hasBuildingPermit;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void buildHouse() {

    }

    public void buildBridge() {

    }
}
