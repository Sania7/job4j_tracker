package ru.job4j.streamnew;

import java.util.Optional;
import java.util.stream.Stream;

public class OptStream {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(-2, 1, 21, 3);
        Optional<Integer> rsl = stream.filter(e -> e == -2).findFirst();
        if (rsl.isPresent()) {
            System.out.println(rsl.get());
        } else {
            System.out.println("Element not found.");
        }
    }
}
