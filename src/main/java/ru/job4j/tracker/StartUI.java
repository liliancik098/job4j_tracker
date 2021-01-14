package ru.job4j.tracker;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class StartUI   {
    public static void main(String[] args) {
       Tracker tracker = new Tracker();
       Item item = new Item(23, "Lilian");
       tracker.add(item);
       tracker.findById(1);
        System.out.println(tracker.findById(1));
       LocalDateTime item1 =  new Item().getCreated();
       DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
       String currentDateTimeFormat = item1.format(formatter);
       System.out.println("Текущие дата и время после форматирования: " + currentDateTimeFormat);
    }
}
