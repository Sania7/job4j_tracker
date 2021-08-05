package ru.job4j.stream;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Analyze {
    /**
     * Метод averageScore вычисляет общий средний балл.
     * для реализации используются методы:
     * - flatMap() для преобразования в поток объектов Subject;
     * - mapToInt() для последующего преобразования в потом оценок по каждому предмету;
     * - average() для расчета среднего бала по предмету;
     * - orElse() для того чтобы вернуть значение по умолчанию.
     * @param stream список учеников
     * @return средний балл
     */
    public static double averageScore(Stream<Pupil> stream) {
        return stream
                .flatMap(pupil -> pupil.getSubjects().stream())
                        .mapToInt(Subject::getScore)
                        .average()
                        .orElse(0D);
    }

    /**
     * Метод averageScoreBySubject вычесляет средний балл ученика по его предметам.
     * надо выполнить преобразование в поток объектов класса Tuple,
     * - метод map() преобразует в поток объекты класса Tuple,
     * - average() для расчета среднего балла
     * - collect(Collectors.toList()) собираем в коллекцию List
     * @param stream список учеников
     * @return Возращает список объектов Tuple (имя ученика и средний балл)
     */
    public static List<Tuple> averageScoreBySubject(Stream<Pupil> stream) {
        return stream.map(pupil -> new Tuple(pupil.getName(), pupil.getSubjects()
                .stream()
                .mapToInt(Subject::getScore)
                .average()
                .orElse(0D)))
                .collect(Collectors.toList());
    }

    /**
     * Метод averageScoreByPupil вычисляет средний балл по всем предметам для каждого ученика.
     * - flatMap() для преобразования в поток объектов Subject;
     * - метод collect() в который передаем метод groupingBy() класса Collectors.
     * значение - средний балл по этому предмету для каждого ученика.
     * конструктор LinkedHashMap::new для сохранения порядка вставляемых элементовтов.
     * Для расчета среднего балла используем метод averagingDouble() класса Collectors;
     * - собранную карту  разбираем с помощью entrySet() и открываем поток с помощью stream();
     * - полученный поток с помощью map() преобразуем в поток объектов класса Tuple,
     * - в конструктор передаем параметры с помощью методов getKey() и getValue() интерфейса Entry;
     * - последний метод collect(), с помощью которого все собираем в коллекцию List.
     * @param stream список учеников
     * @return Возвращает список объектов Tuple (название предмета и средний балл)
     */
    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) {
        return stream.flatMap(pupil -> pupil.getSubjects().stream())
                        .collect(Collectors.groupingBy(
                                Subject::getName, LinkedHashMap::new,
                                Collectors.averagingDouble(Subject::getScore)))
                                .entrySet()
                                .stream()
                                .map(entry -> new Tuple(entry.getKey(), entry.getValue()))
                                .collect(Collectors.toList());

    }

    /**
     * Метод bestStudent - возвращает лучшего ученика.
     * @param stream список учеников
     * @return возвращает объект Tuple
     */
    public static Tuple bestStudent(Stream<Pupil> stream) {
        return stream.map(t -> new Tuple(t.getName(), t.getSubjects()
                .stream()
                .mapToInt(Subject::getScore)
                .sum()))
                .max(Comparator.comparing(Tuple::hashCode))
                .orElse(null);
    }

    /**
     * Метод bestSubject - возвращает предмет с наибольшим баллом для всех студентов.
     * @param stream список учеников
     * @return Возвращает объект Tuple (имя предмета,
     * сумма баллов каждого ученика по этому предмету)
     */
    public static Tuple bestSubject(Stream<Pupil> stream) {
        return stream.flatMap(s -> s.getSubjects().stream())
                .collect(Collectors.groupingBy(
                        Subject::getName, Collectors.summingDouble(Subject::getScore)))
                .entrySet()
                .stream()
                .map(t -> new Tuple(t.getKey(), t.getValue()))
                .max(Comparator.comparing(Tuple::hashCode))
                .orElse(null);

    }
}
