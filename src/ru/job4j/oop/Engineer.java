package ru.job4j.oop;

public class Engineer extends Profession {
    private boolean isLicensedNeeded;

    public Engineer(String name, String surname, String education, String birthday, boolean isLicensedNeeded) {
        super(name, surname, education, birthday);
        this.isLicensedNeeded = isLicensedNeeded;
    }

    public boolean getIsLicensedNeeded() {
        return isLicensedNeeded;
    }
}
