package ru.job4j.oop;

public class Doctor extends Profession {
    private String hospitalName;
    private int yearOfAttestation;

    public Doctor(String name, String surname, String education, String birthday, String hospitalName, int yearOfAttestation) {
        super(name, surname, education, birthday);
        this.hospitalName = hospitalName;
        this.yearOfAttestation = yearOfAttestation;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public int getYearOfAttestation() {
        return yearOfAttestation;
    }
}
