package ru.job4j.oop;

public class Surgeon extends Doctor {
    private int numberOfAssistants;
    private String fieldOfSurgery;

    public Surgeon(String name, String surname, String education, String birthday, String hospitalName, int yearOfAttestation, int numberOfAssistants, String fieldOfSurgery) {
        super(name, surname, education, birthday, hospitalName, yearOfAttestation);
        this.numberOfAssistants = numberOfAssistants;
        this.fieldOfSurgery = fieldOfSurgery;
    }

    public int getNumberOfAssistants() {
        return numberOfAssistants;
    }

    public String getFieldOfSurgery() {
        return fieldOfSurgery;
    }

    public void operate() {

    }

    public void suture() {

    }
}
