package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;

public class Rash {

    public static void main(String[] args) {
        /**
         * Простой пример вывода всех элементов массива
         */
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        for (Integer n : list) {
            System.out.print(n + " ");
        }
        System.out.println();

        list.forEach(n -> System.out.print(n + " "));
        System.out.println();

        list.forEach(System.out::print);
    }
}
