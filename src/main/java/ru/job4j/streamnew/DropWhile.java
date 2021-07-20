package ru.job4j.streamnew;

import java.util.List;

/**
 * Stream.dropWhile - этот метод позволяет получать поток данных после того,
 * как условие стало ложным.
 * Когда обрабатывается число 3 условие v -> v < 3 становится "истина".
 * Все дальнейшие элементы проходят дальше.
 */
public class DropWhile {
    public static void main(String[] args) {
        List.of(1, 2, 3, 4)
                .stream()
                .dropWhile(c -> c < 3)
                .map(c -> "Результат: " + c)
                .forEach(System.out::println);
    }
}
