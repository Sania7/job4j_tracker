package ru.job4j.tracker;

public class FindAction implements UserAction{
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
        Item[] n = tracker.findAll();
        if (n.length == 0) {
            out.println("Error, we can't find result!");
        } else {
            for (int i = 0; i < n.length; i++) {
                out.println("Found: " + n[i]);
            }
        }
        return true;
    }
}
