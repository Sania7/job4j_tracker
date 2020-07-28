package ru.job4j.oop;

public class Cat {
    public String sound() {
        String voice = "may-may";
        return voice;
    }
    public static void main(String[] args) {
        Cat perry = new Cat();
        Cat sparky = new Cat();
        System.out.println(perry.sound());
    }
}
