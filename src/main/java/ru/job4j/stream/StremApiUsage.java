package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class StremApiUsage {
    public static void main(String[] args) {
        // создать списочный массив значений типа Integer
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(23);
        myList.add(34);
        myList.add(12);
        myList.add(5);
        myList.add(-5);
        myList.add(67);
        System.out.println("Исходный список:" + myList);
        System.out.println();
        // получить поток элементов списочного массива
        Stream<Integer> myStream = myList.stream();
        // получить минимальное и максимальное значение
        //вызвав методы min(), max(), isPresent() и get()
        Optional<Integer> minVal = myStream.min(Integer::compare);
        if (minVal.isPresent()) { // метод isPresent проверяет присутствует ли значение в данном
            // объекте
            System.out.println("Минимальное значение: " + minVal.get());
        }
        // создаем новый поток данных, каждый раз когда предидущий поток уже употреблен
        // получить новый поток данных
        myStream = myList.stream();
        Optional<Integer> maxVal = myStream.max(Integer::compare);
        if (maxVal.isPresent()) {
            System.out.println("Максимальное значение:" + maxVal.get());
        }
        // отсортировать поток данных
        Stream<Integer> sortedStream = myList.stream().sorted();
        System.out.println("Отсортированный поток данных:");
        sortedStream.forEach((n) -> System.out.print(n + " "));
        System.out.println();
        // вывести только нечетные целочисленные значения
        Stream<Integer> oddVals = myList
                .stream()
                .sorted()
                .filter((n) -> (n % 2) == 1);
        System.out.print("Нечетные значения: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
        System.out.println();
         oddVals = myList.
                 stream()
                 .sorted()
                 .filter((n) -> (n % 2) == 1)
                 .filter((n) -> n > 5);
        System.out.print("Нечетные значения больше 5: ");
        oddVals.forEach((n) -> System.out.print(n + " "));
    }
}
