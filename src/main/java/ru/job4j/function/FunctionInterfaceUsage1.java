package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Supplier;

public class FunctionInterfaceUsage1 {

    public static void main(String[] args) {
        /**
         * Supplier (поставщик) используется для создания
         * какого-либо объекта и при этом ему не требуется входной параметр.
         * @FunctionalInterface
         * public interface Supplier<T> {
         *     T get();
         * }
         */
        Supplier<String> sup = () -> "New String For Interface";
        System.out.println(sup.get());
        System.out.println();

        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> sub = () -> new HashSet<>(list);
        Set<String> strings = sub.get();
        int i = 1;
        for (String s : strings) {
            System.out.print(i++  + "." + s + " ");
        }

        }
    }
