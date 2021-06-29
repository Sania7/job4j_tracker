package ru.job4j.function;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class FunctionInterfaceUsage5 {
    public static void main(String[] args) {
        /**
         * UnaryOperator и BinaryOperator – это разновидность Function,
         * в которых входные и выходные обобщенные параметры должны совпадать.
         *
         * @FunctionalInterface
         * public interface UnaryOperator<T> extends Function<T, T> {}
         * @FunctionalInterface
         * public interface BinaryOperator<T> extends BiFunction<T,T,T> {}
         * Используем функциональный интерфейс UnaryOperator для того, чтобы перевернуть строку:
         */
        UnaryOperator<StringBuilder> builder = b -> b.reverse();
        System.out.println("Строка после реверса: "
                + builder.apply(new StringBuilder("String for test")));
        System.out.println("Строка после реверса: "
                + builder.apply(new StringBuilder("tset rof gnirtS")));
        System.out.println();

        BinaryOperator<StringBuilder> build = (b1, b2) -> b1.append(" ").append(b2);
        System.out.println("Строка после объединения: " + build.apply(
                new StringBuilder("First string"),
                new StringBuilder("Second strig")
        ));

    }
}
