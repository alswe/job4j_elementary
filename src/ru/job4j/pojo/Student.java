package ru.job4j.pojo;

public class Student {
    private String FIO;
    private String group;
    private String enrollmentDate;

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(String enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setFIO("Ivanov Ivan Ivanovich");
        student.setGroup("PGS-806");
        student.setEnrollmentDate("2017");
        System.out.println("FIO: " + student.getFIO() + System.lineSeparator()
                + "Group: " + student.getGroup() + System.lineSeparator()
                + "Date of enrollment: " + student.getEnrollmentDate());
    }
}
