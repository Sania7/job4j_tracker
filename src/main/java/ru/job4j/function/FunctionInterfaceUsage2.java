package ru.job4j.function;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class FunctionInterfaceUsage2 {
    public static void main(String[] args) {
        /**
         * Consumer (потребитель) используется в том случае,
         * если нам нужно применить какое-то действие или операцию к параметру
         * (для BiConsumer два параметра) и при этом у метода нет возвращаемого значения.
         * @FunctionalInterface
         * public interface Consumer<T> {
         *     void accept(T t);
         * }
         * @FunctionalInterface
         * public interface BiConsumer<T, U> {
         *     void accept(T t, U u);
         * }
         * Два интерфейса отличаются только одним – количеством параметров,
         * которые принимает метод в этом интерфейсе.
         * Это относится ко всем интерфейсам – если видите приставку,
         * Bi – значит отличие лишь в количестве параметров.
         */
        Supplier<String> sup = () -> "New Strig For Interface";
        Consumer<String> consumer = (s) -> System.out.println(s);
        consumer.accept(sup.get());
        System.out.println();

        Supplier<String> supp = () -> "New Strig For Interface";
        BiConsumer<String, String> cons  = (s, s1) -> System.out.println(s + s1);
        cons.accept(supp.get(), " and Second Strig");
        System.out.println();

        List<String> list = List.of("one", "two", "three", "one", "two", "three");
        Supplier<Set<String>> set = () -> new HashSet<>(list);
        BiConsumer<Integer, String> consr = (s, s1) -> System.out.println(s + s1);
        Set<String> strings = set.get();
        int i = 1;
        for (String s : strings) {
            consr.accept(i++, " is " + s);
        }
    }
}
