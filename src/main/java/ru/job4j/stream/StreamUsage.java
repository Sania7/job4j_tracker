package ru.job4j.stream;

import java.util.List;
import java.util.stream.Collectors;

public class StreamUsage {
    public static class Task {
        private final String name; // создаем строковую переменную
        private final long spent; // создаем переменную long

        public Task(String name, long spent) { // создаем конструктор и инициализируем поля
            this.name = name;
            this.spent = spent;
        }

        @Override
        public String toString() {
            return "Task{"
                    + "name='"
                    + name
                    + '\''
                    + ", spent="
                    + spent
                    + '}';
        }

        public static void main(String[] args) {
            List<Task> tasks = List.of(
                    new Task("Bug #1", 10),
                    new Task("Task #2", 20),
                    new Task("Bug #2", 80),
                    new Task("Bug #3", 40));
            tasks.stream() // запускаем поток элементов из созданного листа
                    // если метод возвращает true то элемент передается дальше
                    .filter(task -> task.name.contains("Bug")) // применяем фильтр где есть "Bug"
                    .filter(task -> task.spent > 30) // применяем фильтр где значение меньше 30
              //      .map(task -> task.name + " " + task.spent) // записываем в Map
                    .collect(Collectors.toList()) // прошедшие фильтрацию элементы
                    // записываются в list
                    .forEach(System.out::println); // выводим в печать

        }
    }
}
