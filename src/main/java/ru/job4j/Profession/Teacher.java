package ru.job4j.Profession;

public class Teacher extends Profession {
    private String subject;

    public Teacher(String subject, String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.subject = subject;
    }

    public void study(Student student) {
    }
}
