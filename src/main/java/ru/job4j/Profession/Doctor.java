package ru.job4j.Profession;

public class Doctor extends Profession {
    private int id;
    private String speciality;
    private String nameHosp;

    public Doctor(int id, String speciality, String nameHosp, String name, String surname, String education, String birthday) {
        super(name,surname, education, birthday);
        this.id = id;
        this.speciality = speciality;
        this.nameHosp = nameHosp;
    }

    public void Diagnosis(Pacient pacient) {
    }
}
