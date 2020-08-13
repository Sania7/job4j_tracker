package ru.job4j.tracker;

import java.util.Arrays;

public class DropArray1 {
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", "Fedor","Dima"};
        System.arraycopy(names, 2, names, 1, 3);
        System.out.println(Arrays.toString(names));
    }
}
