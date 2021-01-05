package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 400);
        Book book2 = new Book("Отверженные", 300);
        Book book3 = new Book("Илиада", 350);
        Book book4 = new Book("Черный Лебедь", 480);
        Book[] container = new Book[4];
        container[0] = book1;
        container[1] = book2;
        container[2] = book3;
        container[3] = book4;
        for (int index = 0; index < container.length; index++) {
            Book bk = container[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Swapping 0 and 3 book");
        Book temp = container[0];
        container[0] = container[3];
        container[3] = temp;
        for (int index = 0; index < container.length; index++) {
            Book bk = container[index];
            System.out.println(bk.getName() + " - " + bk.getPages());
        }
        System.out.println("Is there a Clean code book?");
        for (int index = 0; index < container.length; index++) {
            Book bk = container[index];
            if (bk.getName().equals("Clean code")) {
                System.out.println("We have such a book: " + bk.getName());
            }
        }
    }
}
