package ru.job4j.lambda;

import java.util.Comparator;

public interface MyNumber {
    int getValue();
}

/**
 * Продемонстрировать применение простого лямбда выражения
 */
class LambdaDemo {
    public static void main(String[] args) {
        MyNumber myNum; // объявить ссылку на функциональный интерфейс
        /**
         * Здесь лямбда выражение просто является константным выражением.
         * Когда оно присваивается ссылочной переменной myNum получается
         * экземпляр класса в котором лямда выражение реализует метод getValue.
         * Лямбда выражение должно быть совместимо по типу данных с абстрактным методом.
         */
        myNum = () -> 123;
        System.out.println("Фиксированное значение: " + myNum.getValue());
        //более сложное выражение
        myNum = () -> (int) (Math.random() * 100);
        System.out.println("Случайное значение: " + myNum.getValue());
        System.out.println("Еще одно случайное выражение: " + myNum.getValue());

    }
}
