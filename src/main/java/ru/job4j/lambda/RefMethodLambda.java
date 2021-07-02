package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;

public class RefMethodLambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr",
                "Dima Petuhov",
                "Petr Arsentev"
        );

       // Consumer<String> out = (name) -> cutOut(name);
        names.forEach(RefMethodLambda::cutOut);

    }

    public static void cutOut(String value) {
        if (value.length() > 10) {
            System.out.println(value.substring(0, 10) + "...");
        } else {
            System.out.println(value);
        }
    }
}
