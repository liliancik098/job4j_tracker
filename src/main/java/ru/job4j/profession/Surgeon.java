package ru.job4j.profession;

public class Surgeon extends Doctor {

    public Surgeon(int id, String speciality, String nameHosp, String name, String surname, String education, String birthday) {
        super(id, speciality, nameHosp, name, surname, education, birthday);
    }
    public void bandage(Pacient pacient) {
    }
}
