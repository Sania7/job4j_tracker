package ru.job4j.stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// преобразуем набор в потоке в список, toList(), toSet(), toMap();
public class Program {
    public static void main(String[] args) {
        List<String> phones = new ArrayList<>();
        Collections.addAll(phones, "iPhone 8", "HTC U12", "Huawei Nexus 6P",
                "Samsung Galaxy S9", "LG G6", "Xiaomi MI6", "ASUS Zenfone 2",
                "Sony Xperia Z5", "Meizu Pro 6", "Lenovo S850");

        Set<String> filteredPhone = phones.stream()
                .filter(s -> s.length() < 15)
                .collect(Collectors.toSet()); // метод toSet(), toList().
        for (String s : filteredPhone) {
            System.out.println(s);
        }
        System.out.println();

    // для применения метода toMap() надо задать ключ и значение.
        Stream<Phone> phoneStream = Stream.of(
                new Phone("iPhone 8", 54000),
                new Phone("Nokia 9", 45000),
                new Phone("Samsung Galaxy S9", 40000),
                new Phone("LG G6", 32000));
        Map<String, Integer> phone = phoneStream
                .collect(Collectors.toMap(p -> p.getName(), t -> t.getPrice())); // метод toMap()

        phone.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
