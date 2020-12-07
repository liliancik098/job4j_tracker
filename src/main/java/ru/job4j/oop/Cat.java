package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);
    }

    public void giveNick(String nick)  {
        this.name = nick;
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public static void main(String[] args) {
        System.out.println("There are Gav's food.");
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("Kotleta");
        gav.show();
        System.out.println("There are Black's food.");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("Fish");
        black.show();
    }
}
