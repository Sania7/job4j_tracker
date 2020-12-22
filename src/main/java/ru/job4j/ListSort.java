package ru.job4j;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5, 3, 4, 1, 2);
        System.out.println("До сортировки " +  list);
        Collections.sort(list);
        System.out.println("После сортировки " + list);
    }
}
