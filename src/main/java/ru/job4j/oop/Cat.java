package ru.job4j.oop;

public class Cat {

    private String food;
    private String name;

    public void show() {
        System.out.println(this.food);
        System.out.println(this.name);
    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;
    }

    public static void main(String[] args) {
        System.out.println("There are gav`s food.");
        Cat gav = new Cat();
        gav.eat("kotleta");
        gav.giveNick("gav");
        gav.show();
        System.out.println("There are black`s food.");
        Cat black = new Cat();
        black.eat("fish");
        black.giveNick("black");
        black.show();
        System.out.println("There are nick`s food.");
        Cat nick = new Cat();
        nick.giveNick("nick");
        nick.eat("fish");
        nick.show();

    }
}
