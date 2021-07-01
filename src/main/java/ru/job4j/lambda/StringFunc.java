package ru.job4j.lambda;

import java.util.Locale;

public interface StringFunc {
    String func(String n);
}


class BlockLambdaDemo2 {
    public static void main(String[] args) {
        /**
         * Блочное выражение, изменяющее на обратный порядок следования
         * символов в строке.
         */
        StringFunc reverse = (str) -> {
            String result = " ";
            int i;
            for (i = str.length()- 1; i >= 0; i--) {
                result += str.toUpperCase(Locale.ROOT).charAt(i);
            }
            return result;
        };
        System.out.println("Лямбда обращается на "
                           + reverse.func("Лямбда"));
        System.out.println("Выражение обращается на "
                + reverse.func("Выражение"));
    }
}