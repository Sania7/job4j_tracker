package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"one", "1"});
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenValidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"0"});
        ValidateInput input = new ValidateInput(out, in);
        assertThat(input.askInt("Enter: "), is(0));
    }

    @Test
    public void outputCheck() {
        Output out = new StubOutput();
        Input in = new StubInput(new String[]{"in", "2"});
        ValidateInput input = new ValidateInput(out, in);
        input.askInt("Enter");
        assertThat(out.toString(), is(String.format("Please enter validate data again.%n")));

    }
}