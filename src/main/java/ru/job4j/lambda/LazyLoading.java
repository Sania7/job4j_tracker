package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LazyLoading {

    public static void main(String[] args) {
        // Лямбда не вычисляется
        String[] names = {"Ivan"};
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("execute comparator");
            return left.length() - right.length();
        };
        Arrays.sort(names, lengthCmp);

    String[] name = {"Ivan", "Petr"};
    Comparator<String> lengthCm = (left, right) -> {
        System.out.println("execute comparator");
        return left.length() - right.length();
    };
    Arrays.sort(name, lengthCm);
   }
}
