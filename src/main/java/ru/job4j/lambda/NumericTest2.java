package ru.job4j.lambda;

import java.util.Comparator;

public interface NumericTest2 {
    boolean test(int n, int d);
}

class LambdaDemo3 {
    public static void main(String[] args) {
        /**
         * Проверяется является ли одно число множетилем другого числа
         */
        NumericTest2 isFactor = (n, d) -> (n % d) == 0;
        if (isFactor.test(10, 2)) {
            System.out.println("Число 2 является множителем числа 10.");
        }
        if (!isFactor.test(10, 3)) {
            System.out.println("Число 3 не является множителем числа 10.");
        }
    }
}
