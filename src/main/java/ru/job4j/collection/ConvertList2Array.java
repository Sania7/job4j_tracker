package ru.job4j.collection;

import java.util.List;

//3. Конвертация ArrayList в двухмерный массив [#320186]

public class ConvertList2Array {
    public static int[][] toArray(List<Integer> list, int rows) {
        int size = list.size();
        int cells = size % rows == 0 ? size / rows : size / rows + 1;
        int[][] array = new int[rows][cells];
        int count = 0;
        for (int row = 0; row < rows; row++) {
            for (int cell = 0; cell < cells; cell++) {
                if (count == list.size()) {
                    break;
                }
                array[row][cell] = list.get(count++);
            }
        }
        return array;
    }
}
