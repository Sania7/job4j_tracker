package ru.job4j.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CunClone {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ivan");
        names.add("Jan");
        names.add("Van");
        names.add("Ivan");
        names.add("Dima");
        names.add("Ivan");
        names.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
