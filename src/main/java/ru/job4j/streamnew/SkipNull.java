package ru.job4j.streamnew;

import java.util.stream.Stream;

/**
 * Stream.ofNullable - сделает из элемента поток,
 * если элемент равен null, то элемент пропускается.
 * Этот метод позволяет фильтровать поток с null элементами.
 */
public class SkipNull {
    public static void main(String[] args) {
        Stream.of(1, null, 2, null, 3)
                .flatMap(Stream::ofNullable)
                .map(v -> "Результат: " + v)
                .forEach(System.out::println);
    }
}
