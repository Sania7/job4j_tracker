package ru.job4j.lambda;

import java.util.function.Supplier;

/**
 * переменная объявленная внутри лямбда выражения доступна только в самом лямбда выражении
 * переменная объявленная вне лямбда доступна как внутри лямбда так и вне его
 * переменную объявленную вне лямбда выражения изменять внутри лямбда выражения нельзя
 */
public class ScopeInside {

    public static void main(String[] args) {

        String ayyyy = "ayyyyy";

        String name = echo(() -> {
            return ayyyy;
        }
        );
        System.out.println(name);
    }

    private static String echo(Supplier<String> supplier) {
        String sound = supplier.get();
        return sound + " " + sound + " " + sound;
    }
}
