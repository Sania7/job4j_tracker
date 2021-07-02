package ru.job4j.lambda;

import java.util.Arrays;
import java.util.List;

public class RefMethodLambda {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Ivan",
                "Petr",
                "Dima Petuhov",
                "Petr Arsentev"
        );
       // Consumer<String> out = (name) -> cutOut(name);
        /**
         * Ссылки бывают четырех видов
         *
         * Ссылка на статический метод
         * ContainingClass::staticMethodName
         *
         * Ссылка на нестатический метод конкретного объекта
         * containingObject::instanceMethodName
         *
         * Ссылка на нестатический метод любого объекта конкретного типа
         * ContainingType::methodName
         *
         * Ссылка на конструктор
         * ClassName::new
         *
         * names переменная в которой помещен список
         * forEach цикл
         * RefMethodLambd класс
         * cutOut метод
         */
        names.forEach(RefMethodLambda::cutOut);

    }

    public static void cutOut(String value) {
        if (value.length() > 10) {
            System.out.println(value.substring(0, 10) + "...");
        } else {
            System.out.println(value);
        }
    }
}
