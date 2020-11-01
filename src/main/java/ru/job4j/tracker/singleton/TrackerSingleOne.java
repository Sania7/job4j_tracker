package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public enum TrackerSingleOne {
    INSTANCE;
    private Tracker tracker = new Tracker();
    public Item add(Item model) {
        tracker.add(model);
        return model;
    }
    public Tracker getTracker() {
        return tracker;
    }
}
