package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Pletosu Lilian");
        student.setGroup("Stomalogy");
        student.setEnrollmentDate(new Date());
        System.out.println("Студент: " + student.getName() + "\n"
                + "Направление: " + student.getGroup() + "\n"
                + "Дата зачисления: " + student.getEnrollmentDate());


    }
}
