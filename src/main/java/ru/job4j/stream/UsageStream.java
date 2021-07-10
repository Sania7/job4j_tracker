package ru.job4j.stream;


import java.util.ArrayList;
import java.util.stream.Stream;

public class UsageStream {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(34);
        myList.add(-1);
        myList.add(-3);
        myList.add(27);
        myList.add(15);
        myList.add(9);
        System.out.println("Исходный список: " + myList);
        Stream<Integer> list = myList.stream().sorted().filter((n) -> (n > 0));
        list.forEach(System.out::println);

    }
}
