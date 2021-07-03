package ru.job4j.lambda;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;

public class CountingFunctionTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {

        List<Double> result = CountingFunction.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

}