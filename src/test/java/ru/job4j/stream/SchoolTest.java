package ru.job4j.stream;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.Map;

public class SchoolTest {
    @Test
    public void whenListToMap() {
        List<Student> studentList = List.of(
                new Student(50, "Ivan"),
                new Student(23, "Serg"),
                new Student(50, "Ivan"),
                new Student(34, "Dima"),
                new Student(50, "Ivan")
        );
        School listToMap = new School();
        Map<String, Student> rsl = listToMap.listToMap(studentList);
        Map<String, Student> expected = Map.of(
                "Ivan", new Student(50, "Ivan"),
                "Serg", new Student(23, "Serg"),
                "Dima", new Student(34, "Dima")
        );
        Assert.assertEquals(rsl, expected);
    }

}