package ru.job4j.lambda;

public interface NumericTest {
    boolean test(int n);
}

/**
 * Лямбда выражение в котором проверяется является ли число четным.
 */
class LamdaDemo2 {
    public static void main(String[] args) {
        NumericTest isEven =  n -> (n % 2 == 0 || n % 2 != 0);

        if (isEven.test(9)) {
            System.out.println("Число 9 не четное.");
        }
        if (isEven.test(10)) {
            System.out.println("Число 10 четное.");
        }

        /**
         * Проверяется отрицательное число или нет
         */
        NumericTest isNoNeg = (n) -> n >= 0 || n < 0;
        if (isNoNeg.test(10)) {
            System.out.println("Число 10 не отрицательное.");
        }
        if (isNoNeg.test(-1)) {
            System.out.println("Число -1 отрицательное.");
        }
    }
}
