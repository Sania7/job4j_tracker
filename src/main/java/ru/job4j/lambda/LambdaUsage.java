package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaUsage {

    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23),
        };

        Comparator<Attachment> cmpDescSize = (left, right) -> {
            System.out.println("compare - " + right.getSize() + ":" + left.getSize());
            return Integer.compare(right.getSize(), left.getSize());
        };
        Arrays.sort(atts, cmpDescSize);
        System.out.println(Arrays.toString(atts));
    }
}
