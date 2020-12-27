package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("79824177721@yandex.ru", "Alexandr Bannikov"); // в карту добавляем два аргумента,
        // то есть делаем ассоциацию ключа с его значением
        // метод keySet возвращает коллекцию состоящую только из ключей
        // Через метод get мы получаем значение ассоциированное с этим ключом
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println();

        // Другой способ получить все значения - это использовать метод entrySet().
        // Этот метод вернет коллекцию java.util.
        // Set состоящую из объекта Map.Entry, которая сразу содержит и ключ и значение.

        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " = " + value);
        }
        System.out.println();

        //Обновление пары. Пару можно обновить тем же методом, что и вставить.
        //Ключ пары должен быть уникальный.
        // Если в Map уже есть такой key, то ячейка value будет заменена на новое значение.
        //В примере выше размер Map будет 1,а не 2,потому что вторая пара имеет ключ,
        // который уже был в Map.
        //Проверка ключей происходит по методу equals.

        // Важно помнить, что объект key должен правильно реализовывать метод equals,
        // иначе Map работать не будет.

        map.put("79824177721@yandex.ru", "Alexandr Bannikov");
        map.put("79824177721@yandex.ru", "Alexandr Bannikov Alexandrovich");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
        System.out.println();

        // Удаление. Удаление происходит по ключу через метод remove(key);

        HashMap<String, String> map1 = new HashMap<>();
        map.put("79824177721@yandex.ru", "Alexandr Bannikov");
        map.put("parsentev@yandex.ru", "Petr Arsentev");
        map.remove("parsentev@yandex.ru");
        for (String key : map.keySet()) {
            String value = map.get(key);
            System.out.println(key + " = " + value);
        }
    }
}

