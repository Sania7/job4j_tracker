package ru.job4j.collection;

public class Main {
    public static void main(String[] args) {
//        System.out.println(Integer.SIZE);
//        System.out.println(Integer.BYTES);
//        System.out.println(Integer.MAX_VALUE);
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.TYPE);
//        int i = Integer.parseInt("10");
//        System.out.println(i);
//        System.out.println(Integer.parseInt("0011", 2));
//        System.out.println(Integer.parseInt("10", 8));
//        System.out.println(Integer.parseInt("F", 16));

        int a = 5;
        Integer x = Integer.valueOf(a);
        Integer y = Integer.valueOf("20");
        Integer z = Integer.valueOf("20", 8);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
    }
}
