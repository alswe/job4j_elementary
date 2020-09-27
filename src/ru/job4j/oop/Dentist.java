package ru.job4j.oop;

public class Dentist extends Doctor {
    private int numberOfDentalTechnicians;

    public Dentist(String name, String surname, String education, String birthday, String hospitalName, int yearOfAttestation, int numberOfDentalTechnicians) {
        super(name, surname, education, birthday, hospitalName, yearOfAttestation);
        this.numberOfDentalTechnicians = numberOfDentalTechnicians;
    }

    public int getNumberOfDentalTechnicians() {
        return numberOfDentalTechnicians;
    }

    public void installFilling() {

    }

    public void installBraces() {

    }

    public void cleanTeeth() {

    }
}
