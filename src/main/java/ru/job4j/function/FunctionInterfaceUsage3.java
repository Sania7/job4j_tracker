package ru.job4j.function;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FunctionInterfaceUsage3 {
    public static void main(String[] args) {
        /**
         * Predicate (утверждение) наиболее часто применяется в фильтрах
         * и сравнении и объявляются они следующим образом:
         *
         * @FunctionalInterface
         * public interface Predicate<T> {
         *
         *     boolean test(T t);
         * }
         * @FunctionalInterface
         * public interface BiPredicate<T, U> {
         *
         *     boolean test(T t, U u);
         * }
         * Т.е. в метод test() передается один или два параметра,
         * в зависимости от функционального интерфейса
         * и возвращает логическое значение true или false.
         */
        Predicate<String> pred = s -> s.isEmpty();
        System.out.println("Строка пустая: " + pred.test(""));
        System.out.println("Строка пустая: " + pred.test("test"));
        System.out.println();

        BiPredicate<String, Integer> cond = (s, i) -> s.contains(i.toString());
        System.out.println("Строка содержит подстроку: " + cond.test("Name123", 123));
        System.out.println("Строка содержит подстроку: " + cond.test("Name", 123));
    }
}
