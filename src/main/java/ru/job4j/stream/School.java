package ru.job4j.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * метод возвращает отфильтрованный поток
 */
public class School {
    public List<Student> collect(List<Student> students, Predicate<Student> predict) {
        return students.stream()
                .filter(predict)
                .collect(Collectors.toList());
    }

    public Map<String, Student> listToMap(List<Student> students) {
        return students
                .stream()
                .collect(Collectors.toMap(
                        Student::getSurname,
                        e -> e,
                        (f, s) -> f));
    }

    public static void main(String[] args) {
        List<Student> studentList = List.of(
                new Student(50, "Ivan"),
                new Student(23, "Serg"),
                new Student(50, "Ivan"),
                new Student(34, "Dima"),
                new Student(50, "Ivan")
        );
        School listToMap = new School();
        Map<String, Student> rsl = listToMap.listToMap(studentList);
        System.out.println(rsl);
        System.out.println();

    }
}
