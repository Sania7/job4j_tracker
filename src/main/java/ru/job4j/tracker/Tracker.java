package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findByName(String key) {
        Item[] copyItems = new Item[size];
        int copySize = 0;
        for (int index = 0; index < size; index++) {
            Item item = this.items[index];
            if (item.getName().equals(key)) {
                copyItems[copySize] = item;
            }
        }
        return Arrays.copyOf(copyItems, copySize);
    }

    public Item[] findAll() {
        int count = 0;
        Item[] itemsWithoutNames = new Item[items.length];
        for (int index = 0; index < items.length; index++) {
            if (items[index] != null) {
                itemsWithoutNames[count] = items[index];
                count++;
            }
        }
        return Arrays.copyOf(itemsWithoutNames, count);
    }
}