package ru.job4j.stream;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class MatrixTest {
    @Test
    public void whenMatrix() {
        Integer[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Matrix matrix1 = new Matrix();
        List<Integer> rsl = matrix1.convert(matrix);
        List<Integer> expected = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        assertEquals(rsl, expected);
    }

}