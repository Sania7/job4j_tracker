package ru.job4j.tracker;

public class FindAction implements UserAction{
    @Override
    public String name() {
        return "=== Show all items ===";
    }
    @Override
    public boolean execute(Input input, Tracker tracker) {
        Item[] n = tracker.findAll();
        if (n.length == 0) {
            System.out.println("Error, we can't find result!");
        } else {
            for (int i = 0; i < n.length; i++) {
                System.out.println("Found: " + n[i]);
            }
        }
        return true;
    }
}
