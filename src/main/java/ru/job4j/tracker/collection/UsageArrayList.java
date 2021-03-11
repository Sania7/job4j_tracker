package ru.job4j.tracker.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");
        names.add("Vasia");
        names.set(3, "Klava");
        names.remove(0);
        for (String item : names) {
            System.out.println(item + " ");
        }
    }
}
