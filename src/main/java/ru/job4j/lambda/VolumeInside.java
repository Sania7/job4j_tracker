package ru.job4j.lambda;

import java.util.function.Supplier;

public class VolumeInside {
    public static void main(String[] args) {
        int[] number = {4, 5, 6};
        int total = 0;
        for (int i : number) {
            int num = i;
            int tmp = total;
            total = add(() -> tmp + num);
        }
        System.out.println(total);
    }

    private static Integer add(Supplier<Integer> calc) {
        return calc.get();
    }
}
