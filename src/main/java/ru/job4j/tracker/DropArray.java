package ru.job4j.tracker;

import java.util.Arrays;

public class DropArray {
    public static void main(String[] args) {
        String[] names = {"Petr", null, "Ivan", "Stepan", null, "Kuk", null};
        String[] namesWithoutNull = new String[names.length];
        int size = 0; //счетчик перед циклом
        for (int index = 0; index < names.length; index++) {
            String name = names[index]; // name имя каждого индекса
            if (name != null) { // если индекс не равен null
                namesWithoutNull[size] = name;
                size++; // прибавляем имена
            }
        }
        namesWithoutNull = Arrays.copyOf(namesWithoutNull, size);
        for (int index = 0; index < namesWithoutNull.length; index++) {
            System.out.println(namesWithoutNull[index]);
        }
    }
}
