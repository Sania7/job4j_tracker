package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {

    public static void main(String[] args) {
        String[] atts = {
                ("image 1"),
                ("image 3"),
                ("image 2"),
        };

        Comparator<String> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + right.length() + ":" + left.length());
            return Integer.compare(right.length(), left.length());
        };
        Arrays.sort(atts, cmpDescSize);
        System.out.println(Arrays.toString(atts));
    }
}
