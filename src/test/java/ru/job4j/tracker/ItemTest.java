package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void whenWeSortDirectly() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Book", 12));
        items.add(new Item("Pen", 7));
        items.add(new Item("Bag", 3));
        items.add(new Item("Table", 5));
        items.add(new Item("Note", 1));
        Collections.sort(items, new SortById());
        List<Item> items2 = new ArrayList<>();
        items2.add(new Item("Note", 1));
        items2.add(new Item("Bag", 3));
        items2.add(new Item("Table", 5));
        items2.add(new Item("Pen", 7));
        items2.add(new Item("Book", 12));
        assertThat(items, is(items2));
    }

    @Test
    public void whenWeSortReverse() {
        List<Item> items = new ArrayList<>();
        items.add(new Item("Book", 12));
        items.add(new Item("Pen", 7));
        items.add(new Item("Bag", 3));
        items.add(new Item("Table", 5));
        items.add(new Item("Note", 1));
        Collections.sort(items, new SortByReverseId());
        List<Item> items2 = new ArrayList<>();
        items2.add(new Item("Book", 12));
        items2.add(new Item("Pen", 7));
        items2.add(new Item("Table", 5));
        items2.add(new Item("Bag", 3));
        items2.add(new Item("Note", 1));
        assertThat(items, is(items2));
    }
}