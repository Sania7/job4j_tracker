package ru.job4j.tracker;

import java.util.List;

public class FindAction implements UserAction {
    private final Output out;

    public FindAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("Show all items");
        List<Item> items = tracker.findAll();
        if (!items.isEmpty()) {
            for (Item item : items) {
                out.println(item);
            }
        } else {
            out.println("Error, we can't find result!");
            }
        return true;
    }
}
