package ru.job4j.lambda;

import java.util.Comparator;

public class LambdaUsage {

    public static void main(String[] args) {

        Comparator<String> cmpText = (left, right) -> {
            //с выводом отладочной информации на консоль
            System.out.println("compare - " + left + " : " + right);
            return left.compareTo(right);
        };

        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + right.length() + ":" + left.length());
            return right.length() - left.length();
        };
    }
}
