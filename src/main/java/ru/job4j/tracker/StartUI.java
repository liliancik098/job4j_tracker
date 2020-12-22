package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class StartUI   {
    public static void main(String[] args) {
       LocalDateTime item =  new Item().getCreated();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
       String currentDateTimeFormat = item.format(formatter);
       System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}
