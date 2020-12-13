package ru.job4j.profession;

public class Dentist extends Doctor {

    public Dentist(int id, String speciality, String nameHosp, String name, String surname, String education, String birthday) {
        super(id, speciality, nameHosp, name, surname, education, birthday);
    }
    public void removeTeeth(Pacient pacient) {
    }
}
