package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class RefMethod {
    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr",
                "Dima"
        );
       // Consumer <String> consumer = (name) -> System.out.println(name);
        Consumer<String> consumer = System.out::println;
        names.forEach(consumer);
    }
}
