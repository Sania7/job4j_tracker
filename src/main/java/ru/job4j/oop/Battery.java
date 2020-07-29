package ru.job4j.oop;

public class Battery {
    private int load;
    public Battery(int size) {
        this.load = size;
    }
    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }
    public static void main(String[] args) {
        Battery first = new Battery(100);
        Battery second = new Battery(10);
        System.out.println("First battery : " + first.load + ". Second battery : " + second.load);
        first.exchange(second);
        System.out.println();
        System.out.println("First battery : " + first.load + ". Second battery : " + second.load);
    }
}
