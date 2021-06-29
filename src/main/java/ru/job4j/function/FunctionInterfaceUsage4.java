package ru.job4j.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class FunctionInterfaceUsage4 {
    public static void main(String[] args) {
        /**
         * Function используется для преобразования входного параметра
         * или двух параметров (для Bi-формы этого функционального интерфейса)
         * в какое-либо значение,
         * тип возвращаемого значения может не совпадать с типом входных параметров.
         *
         * @FunctionalInterface
         * public interface Function<T, R> {
         *
         *     R apply(T t);
         * }
         * @FunctionalInterface
         * public interface BiFunction<T, U, R> {
         *
         *     R apply(T t, U u);
         * }
         */

        Function<String, Character> function = s -> s.charAt(2);
        System.out.println("Третий символ в строке: " + function.apply("first"));
        System.out.println("Третий символ в строке: " + function.apply("second"));
        System.out.println();

        BiFunction<String, Integer, String>
                biFunction = (s, i) -> s.concat(" ").concat(i.toString());
        System.out.println("Результат работы бифункции: "
                + biFunction.apply("Name", 123));
        System.out.println("Результат работы бифункции: "
                + biFunction.apply("String number", 123));
    }
}
