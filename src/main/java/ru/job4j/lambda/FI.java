package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class FI {
    public static void main(String[] args) {
        Attachment[] atts = {
                new Attachment("image 1", 20),
                new Attachment("image 3", 120),
                new Attachment("image 2", 23),
        };
        // анонимный класс
//        Comparator<Attachment> comparator = new Comparator<Attachment>() {
//            @Override
//            public int compare(Attachment left, Attachment right) {
//                return left.getSize() - right.getSize();
//            }
//        };

        // можно заменить на лямбда выражение
        Comparator<Attachment> comparator = (left, right) -> left.getSize() - right.getSize();
        Arrays.sort(atts, comparator);

        // компоратор для строк через лямбда, через метод compareTo.
        Comparator<Attachment> cmpSize = (left, right) -> left.getName().compareTo(right.getName());
        Arrays.sort(atts, cmpSize);
        System.out.println(Arrays.asList(atts));

        //компаратор для строки по убыванию
        Comparator<Attachment> cmpDescSize = (left, right) ->
                Integer.compare(right.getSize(), left.getSize());
        Arrays.sort(atts, cmpDescSize);
        System.out.println(Arrays.asList(atts));
    }
}