package ru.job4j.streamnew;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Метод должен вернуть список студентов, у которых балл аттестата больше bound.
 * Во входящем списке могут быть null элементы.
 * Порядок действий.
 * - Используя метод filter убрать null;
 * - Отсортировать список;
 * - Используя метод takeWhile, получить нужный поток;
 * - Сохранить поток в List.
 */
public class StudentLevel {
    public static List<Student> levelOf(List<Student> students, int bound) {
        return students
                .stream()
                .filter(Objects::nonNull)
                .sorted((left, right) -> right.getScore() - left.getScore())
                .takeWhile(st -> st.getScore() > bound)
                .collect(Collectors.toList());

    }
}
