package ru.job4j.Profession;

public class MusicalTeacher extends Teacher {
    private String nameMusSchool;

    public MusicalTeacher(String name, String surname, String education, String birthday, String subject, String nameMusSchool) {
        super(name, surname, education, birthday, subject);
        this.nameMusSchool = nameMusSchool;
    }
}
