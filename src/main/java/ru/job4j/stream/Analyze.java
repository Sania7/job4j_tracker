package ru.job4j.stream;

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

    public static List<Tuple> averageScoreByPupil(Stream<Pupil> stream) { // средний балл по ученику
        return List.of();
    }

    public static Tuple bestStudent(Stream<Pupil> stream) { // лучший студент
        return null;
    }

    public static Tuple bestSubject(Stream<Pupil> stream) { // лучший предмет
        return null;
    }
}
