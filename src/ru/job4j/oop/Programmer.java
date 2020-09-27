package ru.job4j.oop;

public class Programmer extends Engineer {
    private String programmingLanguage;
    private String technologicalStack;

    public Programmer(String name, String surname, String education, String birthday, boolean isLicensedNeeded, String programmingLanguage, String technologicalStack) {
        super(name, surname, education, birthday, false);
        this.programmingLanguage = programmingLanguage;
        this.technologicalStack = technologicalStack;
    }

    public String writeCode() {
        return "";
    }

    public void testCode() {

    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public String getTechnologicalStack() {
        return technologicalStack;
    }


}
