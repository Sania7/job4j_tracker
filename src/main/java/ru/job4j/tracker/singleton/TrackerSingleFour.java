package ru.job4j.tracker.singleton;

import ru.job4j.tracker.Item;
import ru.job4j.tracker.Tracker;

public class TrackerSingleFour {
    private Tracker tracker;
    private TrackerSingleFour() {
        tracker = new Tracker();
    }
    public static TrackerSingleFour getInstance() {
        return Holder.INSTANCE;
    }
    public Item add(Item model) {
        return model;
    }
    public Tracker getTracker() {
        return tracker;
    }
    public static final class Holder {
        public static final TrackerSingleFour INSTANCE = new TrackerSingleFour();
    }

    public static void main(String[] args) {
        TrackerSingleFour tracker = TrackerSingleFour.getInstance();
    }
}
